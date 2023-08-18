package com.company;

public class HighestPalindrome {

    public static void main(String[] args) {
        String input = "3943";
        int k = 1;
        System.out.println(highestPalindrome(input, k)); // Output: 3993
    }

    public static String highestPalindrome(String input, int k) {
        return generateHighestPalindrome(input, k, 0, input.length() - 1);
    }

    private static String generateHighestPalindrome(String input, int k, int left, int right) {
        if (left >= right) {
            return input;
        }

        if (input.charAt(left) != input.charAt(right)) {
            char maxChar = (char) Math.max(input.charAt(left), input.charAt(right));
            if (k > 0 && maxChar != '9') {
                char[] chars = input.toCharArray();
                chars[left] = '9';
                chars[right] = '9';
                return generateHighestPalindrome(new String(chars), k - 1, left + 1, right - 1);
            } else {
                char[] chars = input.toCharArray();
                chars[left] = maxChar;
                chars[right] = maxChar;
                return generateHighestPalindrome(new String(chars), k, left + 1, right - 1);
            }
        }

        return generateHighestPalindrome(input, k, left + 1, right - 1);
    }
}
