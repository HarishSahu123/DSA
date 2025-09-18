package org.practice.dsa.StringPractice.Basic;

import java.util.Locale;

public class substr {
    public static void main(String[] args) {
        String z ="abcd";
        System.out.println(z.length());
        System.out.println(z.substring(2));
        System.out.println(z.substring(1,4));
       z= z.concat("hskfdsk");


        System.out.println(z.length());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf("c"));
        System.out.println(z.toUpperCase(Locale.ROOT));
    }
}
