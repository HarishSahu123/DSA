package org.practice.dsa.sorting;

public class InsertionSort {
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
            int key = arr[i];  // Element to insert
            int j = i - 1;

            // Shift elements to the right until the correct position for key is found
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
