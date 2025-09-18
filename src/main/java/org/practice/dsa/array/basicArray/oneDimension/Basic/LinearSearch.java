package org.practice.dsa.array.basicArray.oneDimension.Basic;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your targent number:");
        int  t=sc.nextInt();

        System.out.print("Enter array size:");
        int n=sc.nextInt();


        int[] arr=new int[n];

        System.out.println("Enter element of array:");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        boolean flag=false;
        for (int i = 0; i < n; i++) {
           if (arr[i]==t) {
               flag = true;
               break;
           }
        }

        if (flag==true) System.out.println("found");

        else System.out.println("Not found");
    }
}
