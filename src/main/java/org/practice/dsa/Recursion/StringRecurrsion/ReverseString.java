package org.practice.dsa.Recursion.StringRecurrsion;

public class ReverseString {
    public static void main(String[] args) {
        String s ="Harish";
        int idx=0;

        System.out.println(reverseStringMethod(s,idx));
    }


    private static String reverseStringMethod(String a,int i) {
        //base case
        if(i>=a.length())return "";

        //recurssive work
        String smallans = reverseStringMethod(a, i +1);
        //self work
        return smallans + a.charAt(i);


    }
}
