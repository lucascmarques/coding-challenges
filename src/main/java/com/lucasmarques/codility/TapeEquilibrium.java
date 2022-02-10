package com.lucasmarques.codility;

/**
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
 *
 * For example, in array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 * that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
 *
 * For example, given array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the function should return 7, as explained in the example above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 *
 * Refer to <a href="https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/">Link</a>
 */
public class TapeEquilibrium {

    public static int solution(int[] values) {

        int[] left = new int[values.length], right = new int[values.length];
        int sumLeft = 0, sumRight = 0;

        for (int i = 0, j = values.length - 1; i < values.length; i++,j--) {
            sumLeft += values[i];
            left[i] = sumLeft;
            sumRight += values[j];
            right[j] = sumRight;
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < values.length - 1; i++) {
            int diff = Math.abs(left[i] - right[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
    }

}
