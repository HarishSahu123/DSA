package org.practice.dsa.practiceSorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9, 11, 15}; // sorted array for binary search
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        boolean b = binaryMethod(arr, 0, arr.length - 1, target);
        if(b){
            System.out.println("yes");
        }else {
            System.out.println("no not availabel");
        }
    }

    static boolean binaryMethod(int [] arr, int st, int end ,int target) {
        if (st > end){
            return false;//base case
        }
        int mid =(st+end)/2;

        if(arr[mid]==target) {
            return true;// element found
        } else if (arr[mid]<target) {
            return binaryMethod(arr, mid + 1, end, target); // search right half
        }else {
            return binaryMethod(arr, st, mid - 1, target); // search left half
        }

    }

}

