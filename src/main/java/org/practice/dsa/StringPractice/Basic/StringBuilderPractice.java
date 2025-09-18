package org.practice.dsa.StringPractice.Basic;

import java.util.Locale;
import java.util.Scanner;

public class StringBuilderPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a="Harish sahu";
        double b=10.242423432423432432423;
       // System.out.printf("%.2f",b);

        System.out.println(a.toUpperCase(Locale.ROOT));//HARISH SAHU

        StringBuilder stringBuilder=new StringBuilder("Hari");
        stringBuilder.append("is");
        System.out.println(stringBuilder.lastIndexOf("H")) ;//INDEX=0;
        stringBuilder.delete(1,3);
        stringBuilder.setCharAt(1,'Z');
        System.out.println(stringBuilder.charAt(3)); //
        System.out.println(stringBuilder.toString());
    }
}
