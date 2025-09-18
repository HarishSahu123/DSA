package org.practice.dsa.sorting;

public class InsertionSortSwap {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 6, 48, 12};
        System.out.println("Original array:");
        printArray(arr);

        insertSorting(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    static void insertSorting(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    // Swap method
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
