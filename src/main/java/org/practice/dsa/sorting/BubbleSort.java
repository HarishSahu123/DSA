package org.practice.dsa.sorting;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr={0,0,0,0,0,2};
        System.out.println("original array: ");
        printArray1(arr);
        sorting(arr);

        System.out.println("after sorted array:" );
        printArray1(arr);
    }
    static void printArray1(int[] a ){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    static void sorting(int []arr) {
        int n = arr.length;
        // Outer loop - runs for each element
        for (int i = 0; i < n - 1; i++) {
            // Inner loop - compares adjacent elements

            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            }

    }
    }

