package com.company;

import java.util.Stack;

public class BalancedBracket {

    public static void main(String[] args) {
        String input1 = "{[()]}";
        System.out.println(isBalanced(input1)); // Output: YES

        String input2 = "{[(])}";
        System.out.println(isBalanced(input2)); // Output: NO

        String input3 = "{(([])[])[]}";
        System.out.println(isBalanced(input3)); // Output: YES
    }

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
