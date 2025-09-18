package org.practice.dsa.loop;

import java.util.Scanner;

public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a =sc.nextInt();
        for(int i =a ;i<=10 ;i++){
         //   System.out.println(i);
            if(i == 7){
              //  System.out.println("Number is: " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
