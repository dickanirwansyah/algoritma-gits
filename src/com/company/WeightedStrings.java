package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeightedStrings {

    public static List<String> weightedSubstrings(String input) {
        List<String> result = new ArrayList<>();
        char currentChar = input.charAt(0);
        int currentWeight = 1;

        for (int i = 1; i < input.length(); i++) {
            char charAtI = input.charAt(i);
            if (charAtI == currentChar) {
                currentWeight++;
            } else {
                result.add(new String(new char[currentWeight]).replace('\0', currentChar));
                currentChar = charAtI;
                currentWeight = 1;
            }
        }

        result.add(new String(new char[currentWeight]).replace('\0', currentChar));
        return result;
    }

    public static void main(String[] args) {
        String input = "bbccc";
        List<String> substrings = weightedSubstrings(input);
        System.out.println(substrings);  // Output: [b, bb, c, cc, ccc]
    }
}

