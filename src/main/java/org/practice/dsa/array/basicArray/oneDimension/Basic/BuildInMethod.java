package org.practice.dsa.array.basicArray.oneDimension.Basic;

import java.util.Arrays;

public class BuildInMethod {
    public static void main(String[] args) {

        int[] arr={1, 2,53,43,65, 56,654,4554};
        int [] brr=arr; //Shallow copy(call by refernc copy the orginal value brr and arr both are point same value )

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        brr[0]=100;
        System.out.println();
        System.out.print(arr[0]);
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(brr[i] + " ");
        }

        System.out.println();
        Arrays.sort(arr);  //ascending order
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
