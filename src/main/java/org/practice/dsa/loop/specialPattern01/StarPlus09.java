package org.practice.dsa.loop.specialPattern01;

import java.util.Scanner;

public class StarPlus09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number (n): ");
        int n = sc.nextInt();

        // Only odd numbers for symmetrical plus shape
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number to form a symmetrical plus.");
            return;
        }

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print star in the middle row or middle column
                if (i == mid || j == mid) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
