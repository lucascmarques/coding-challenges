package com.lucasmarques.leetcode;

public class RomanToInteger {

    public static int romanToInt(String s) {

        char[] romanChars = s.toCharArray();
        int lastNumber = Integer.MAX_VALUE;
        int result = 0;

        for (char romanChar : romanChars) {
            int number = romanCharToInt(romanChar);
            if (lastNumber < number) {
                number -= (lastNumber * 2);
            }
            result += number;
            lastNumber = number;
        }

        return result;

    }

    private static int romanCharToInt(char char_) {
        switch (char_) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
        }
        throw new IllegalArgumentException("Not valid roman character (" + char_ + ")");
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}
