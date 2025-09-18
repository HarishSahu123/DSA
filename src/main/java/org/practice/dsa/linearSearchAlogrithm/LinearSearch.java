package org.practice.dsa.linearSearchAlogrithm;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 6, 3, 6, 10};
        int target = 7;
        System.out.println(linearSearchMethod(arr, target));


    }

    static String linearSearchMethod(int[] a, int t) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == t) {
                return "yes";
            }
        }
        return "not found";
    }
}


