package org.practice.dsa.practiceSorting;

import java.util.Scanner;

public class BinarySearch02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("Enter Element :");
        int target = sc.nextInt();


        boolean b = methodForBinary(a, target, 0, a.length - 1);
        if (b) {
            System.out.println("Target found!");
        } else {
            System.out.println("Target not found!");
        }
    }

    static boolean methodForBinary(int[] a, int target, int st, int end) {
        if (st > end) {
            return false;
        }//base case
        int mid = st + (end - st) / 2;
        //sub Problem
        if (a[mid] == target) {
            return true;// Found eleemnt
        } else if (a[mid] < target) {
            return methodForBinary(a, target, mid + 1, end);//Search Right part
        } else {
            return methodForBinary(a, target, st,  mid - 1);//search left part
        }


    }
}
