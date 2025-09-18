package org.practice.dsa.loop;

import java.util.Scanner;

public class TableForLoop {
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int a= sc.nextInt();

       for(int i =a; i<=a*10 ; i+=a){
           System.out.println(i);
       }
    }
}
