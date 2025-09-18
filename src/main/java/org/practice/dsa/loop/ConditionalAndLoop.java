package org.practice.dsa.loop;

import java.util.Scanner;

public class ConditionalAndLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();

       for(int i =a ; i<=100 ;i++){
           if(i%3 ==0){
               System.out.println("F");
           }
           else if (i%5==0) {
               System.out.println("M");
           } else if (i%3==0 && i%5 ==0) {
               System.out.println("MF");
           }
           else System.out.println(i);
       }
    }
}
