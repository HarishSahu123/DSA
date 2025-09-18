package org.practice.dsa.Condition;

import java.util.Scanner;

public class TernaryOperatorFIndOddAndEven108 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
       int a =sc.nextInt();
       //Ternay oprator- if(condition ? value_if_true : value_if_false; )

        System.out.println(a%2==0? "Even" :"odd");
    }
}
