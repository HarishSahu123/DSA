package org.practice.dsa.Recursion;

public class FactorialPractice {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorialMethod(n));
    }

    private static Long factorialMethod(int n) {
        //base case
        if(n==0 || n==1){
            return 1L;
        }
        //recursive work +self work
        return factorialMethod(n - 1) * n;

    }
}
