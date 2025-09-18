package org.practice.dsa.Recursion.Array;

public class MaxOfArray {
    public static void main(String[] args) {
        int[]a={1,3,4,6,3,-4,3};
        int idx=0;
        int max = maxOfArrayMethod(a, idx);
        System.out.println("Maximum element: " + max);
    }

    private static int maxOfArrayMethod(int[] a, int idx) {
        // Base case: last element is the maximum when reached
        if (idx == a.length - 1) {
            return a[idx];
        }
        // Recursive call: find max in remaining part of array
        int maxInRest = maxOfArrayMethod(a, idx + 1);

        // Compare current element with max from rest
        return Math.max(a[idx], maxInRest);
    }
}
