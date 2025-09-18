package org.practice.dsa.Recursion;

public class CountOfDigit {
    public static void main(String[] args) {
        Long a=42L;


        System.out.println( countOfDigit(a));
    }

    private static int countOfDigit(Long a) {
        int count =0;

        if(a==0){
            return 0;
        }

        //432/10=43 and 432%10=2

        count=countOfDigit(a/10)+1;

        return count;

    }
}
