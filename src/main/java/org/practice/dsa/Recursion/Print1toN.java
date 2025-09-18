package org.practice.dsa.Recursion;

public class Print1toN {
    public static void main(String[] args) {
        int n=10;
        print1toNMethod(n);
    }

    private static void print1toNMethod(int n) {

        //base case
        if(n==0){
            return;
        }

        //recursive work
        print1toNMethod(n-1 );//10-9-8-7-6-5-2-1

//        self work
        System.out.print(n +" ");
    }
}
