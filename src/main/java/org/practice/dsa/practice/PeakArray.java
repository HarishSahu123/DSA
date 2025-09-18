package org.practice.dsa.practice;

public class PeakArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1000, 5, 4, 3, 2, 1};

        // Iteration method call
        int peakIndexIter = peakArrayMethodByUsingIteration(arr);
        System.out.println("Peak Index (Iteration): " + peakIndexIter + ", Peak Value: " + arr[peakIndexIter]);

        // Recursion method call
        int low = 0;
        int high = arr.length - 1; // Fix here
        int peakIndexRec = peakArrayMethodByUsingRecurrsion(arr, low, high);
        System.out.println("Peak Index (Recursion): " + peakIndexRec + ", Peak Value: " + arr[peakIndexRec]);
    }

    // Using Binary Search - Recursion
    private static int peakArrayMethodByUsingRecurrsion(int[] arr, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is peak
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            }

            // If right neighbor is bigger, peak must be on right side
            if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                return peakArrayMethodByUsingRecurrsion(arr, mid + 1, high);
            }
            // Else peak is on left side
            else {
                return peakArrayMethodByUsingRecurrsion(arr, low, mid - 1);
            }
        }
        return -1; // No peak found
    }

    // Using Iteration Method
    private static int peakArrayMethodByUsingIteration(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                return mid; // Found peak
            }

            if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1; // Go right
            } else {
                high = mid - 1; // Go left
            }
        }
        return -1; // No peak found
    }
}
