package org.practice.dsa.Recursion;

public class GCD {
    public static void main(String[] args) {
        int [] arr={3,43,5,6,7,4,7,4,6,8};
        int a=3;
        int b=10;
        System.out.println("GCD of " + a + " and " + b + " is: " + EuclidgcdMethod(a, b));

    }

    private static int EuclidgcdMethod(int a, int b) {

        // Base condition: if b becomes 0, GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive step
        return EuclidgcdMethod(b, a % b);
    }
    }


