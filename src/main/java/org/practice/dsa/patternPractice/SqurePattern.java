package org.practice.dsa.patternPractice;

import java.util.Scanner;

public class SqurePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a= sc.nextInt();

        for(int i=1 ;i<=a; i++){       //row/line
            for (int j=1 ;j<=a;j++){  //column/number of star
                System.out.print(" * ");  //
            }

         System.out.println(" ");// // move to next line after printing one row
        }

    }

}
