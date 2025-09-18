package org.practice.dsa.loop.specialPattern01;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) { // line/row iteration
            for (int j = 1; j <= a; j++) { // column iteration
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println(); // move to next line after each row
        }

        sc.close(); // Close the scanner
    }
}
