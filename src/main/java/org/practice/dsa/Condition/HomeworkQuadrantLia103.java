package org.practice.dsa.Condition;

import java.util.Scanner;

public class HomeworkQuadrantLia103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x axi coordinate:");
       double a =sc.nextDouble();
        System.out.print("enter Y aix coordinate:");
        double b= sc.nextDouble();

        if(a>0 && b>0) System.out.println("1 st quad");
        if(a<0 && b>0 ) System.out.println("2 rd quad");
        if(a<0 && b<0) System.out.println("3 rd quad");
        if (a>0 && b<0) System.out.println("4 th quad");
    }
}
