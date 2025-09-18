package org.practice.dsa.Recursion;

import java.util.Scanner;

public class NthNumberPrint {

    static void printIncreasing(int n){
        if (n==1){
          System.out.print(n+ " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n +" ");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth Number:");
        int n = sc.nextInt();

        printIncreasing(n);

    }
}
