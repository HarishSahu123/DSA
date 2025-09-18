package org.practice.dsa.Condition;

import java.util.Scanner;

public class ReultBasedOnPercentage103IfElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        if(a<40) System.out.println("fail");
        else if(a>=41) System.out.println("PAss");

    }
}
