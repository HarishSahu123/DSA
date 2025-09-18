package org.practice.dsa.Recursion;

public class SumOfNdigit {

    public static void main(String[] args) {
        int b=21311;
        int sum = SumOfNdigitMethod(b);
        System.out.println(sum);


    }

    private static int SumOfNdigitMethod(int b) {
        int ans;
        //Base case
        if(b==0){
            return 0;
        }
        //Small task
        int sum = SumOfNdigitMethod(b / 10);

        //Self work
//
//        sum of all digit +last digit
        return sum+b%10;
    }

}
