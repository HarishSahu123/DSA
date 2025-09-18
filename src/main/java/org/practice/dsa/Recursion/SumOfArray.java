package org.practice.dsa.Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int [] a={3,5,3,-6,5};
        int idx=0;
        printOfArray(a,idx);


    }

    private static void printOfArray(int[] a, int idx) {
        if(idx== a.length)return;
        //small work
        System.out.println(a[idx]);
        printOfArray(a,idx+1);
        //self work

    }
}
