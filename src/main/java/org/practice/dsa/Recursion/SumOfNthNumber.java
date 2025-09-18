package org.practice.dsa.Recursion;

public class SumOfNthNumber {
    static int sumOfNum(int a){
        if(a==0){
            return 0;
        }
        return a +sumOfNum(a-1);
    }
    public static void main(String[] args) {

        int n=4;
        //   System.out.println(n);
        System.out.println(sumOfNum(n));
    }
}
