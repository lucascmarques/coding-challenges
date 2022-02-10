package com.lucasmarques.leetcode;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 *
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Example 3:
 *
 * Input: haystack = "", needle = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= haystack.length, needle.length <= 5 * 104
 * haystack and needle consist of only lower-case English characters.
 *
 * Refer to <a href="https://leetcode.com/problems/implement-strstr/">Link</a>
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int indexTo = needle.length();

        while (indexTo <= haystack.length()) {
            int index = findString(haystack, needle, indexTo++);
            if (index >= 0) return index;
        }

        return -1;
    }

    private int findString(String haystack, String needle, int to) {
        int from = to - needle.length();
        if (needle.equals(haystack.substring(from, to))) {
            return from;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        System.out.println(implementStrStr.strStr("hello", "ll") == 2);
        System.out.println(implementStrStr.strStr("hello", "lo") == 3);
        System.out.println(implementStrStr.strStr("aaaa", "ba") == -1);
        System.out.println(implementStrStr.strStr("", "") == 0);
        System.out.println(implementStrStr.strStr("oudhladebgajuge", "ge") == 13);
        System.out.println(implementStrStr.strStr("oudhladebgajuge", "lade") == 4);
    }

}
