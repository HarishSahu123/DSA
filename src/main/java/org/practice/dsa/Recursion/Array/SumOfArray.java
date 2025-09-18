package org.practice.dsa.Recursion.Array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 83, 5, 7};
        int idx = 0;
        int sum = sumofArrayMethod(a, idx);
        System.out.println("Sum of array: " + sum);
    }

    private static int sumofArrayMethod(int[] a, int idx) {
        // Base case: when index reaches the end of array
        if (idx == a.length) return 0;

        // Recursive call: sum of current element + sum of rest
        return a[idx] + sumofArrayMethod(a, idx + 1);
    }
}
