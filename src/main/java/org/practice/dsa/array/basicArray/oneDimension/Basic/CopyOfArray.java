package org.practice.dsa.array.basicArray.oneDimension.Basic;

import java.util.Arrays;

public class CopyOfArray {

    public static void main(String[] args) {
        int [] arr={1, 3, 4, 5, 6,7,8 ,9};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }

        int[] brr=arr;// shollwo copy there is copy only reference not create new arry of brr

        System.out.println();
        // Deep copy
        int[] crr= Arrays.copyOf(arr, arr.length);

        crr[0]=100;
        System.out.println(arr[0]);
        System.out.println();
        for (int i = 0; i <crr.length ; i++) {
            System.out.print(crr[i] +" ");
        }
    }
}
