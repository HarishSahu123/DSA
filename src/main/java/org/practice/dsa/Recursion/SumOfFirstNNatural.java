package org.practice.dsa.Recursion;

public class SumOfFirstNNatural {

    public static void main(String[] args){
        int b=10;
        int sum = sumOfFirstNNaturalMethos(b);
        System.out.println(sum);
    }

    private static int sumOfFirstNNaturalMethos(int n) {
        if(n==0){
            return 0;
        }
        //recursive work
        int sum = sumOfFirstNNaturalMethos(n - 1);
        //self work
        return sum+n;

    }
}
