package org.practice.dsa.linearSearchAlogrithm;

public class SumoTwoIntegerEqualTarget {
    public static void main(String[] args) {
        int[] arr = {1, 43, 3, 53, 6, 87, 5, 7, 5, 6};
        int target = 2;

        boolean found = false;

        // Brute force check all pairs
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] +
                            " = " + target + " (indices " + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found that sum to " + target);
        }
    }
}
