package org.practice.dsa.Condition;

import java.util.Scanner;

public class ResultBasedOnPerentage103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage:");
        int a = sc.nextInt();

        if(a<=40)
            System.out.println("FAIL");

        if(a>40 && a<60)
            System.out.println("Average");
        if(a>60 && a<80)
            System.out.println("Good");
        if(a>80 && a<=100)
            System.out.println("v good");

    }
}
