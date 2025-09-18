package org.practice.dsa.Recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorialNumber(4));
    }
    static Long factorialNumber(int a ){
        if(a==0){
            return 1L;
        }
        return a*factorialNumber(a-1);
    }
}
