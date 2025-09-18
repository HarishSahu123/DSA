package org.practice.dsa.Condition;

import java.util.Scanner;

public class TernaryOperatorTriangleValidOrInvalid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1sd side :");
        double a =sc.nextDouble();
        System.out.println("Enter 2rd side :");
        double b =sc.nextDouble();
        System.out.println("Enter 3rd side :");
        double c =sc.nextDouble();

        //Ternary operator
        System.out.println((a+b)>c && (b+c)>a && (c+a)>b ?"Triangle valid" :"Triangle is Invalid");
    }
}
