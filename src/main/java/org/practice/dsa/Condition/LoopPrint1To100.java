package org.practice.dsa.Condition;

import java.util.Scanner;

public class LoopPrint1To100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int a =sc.nextInt();
        for(int i = 0; i<=a ; i++){
   //         System.out.println(i);
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
