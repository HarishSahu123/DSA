package org.practice.dsa.Recursion.StringRecurrsion;

public class CheckPalindromeStringWithoutReverseMethod {
    public static void main(String[] args) {
        String  str="ABCDCAA";
        int r=str.length()-1;
        int l=0;
        System.out.println( palindromeMethod(str ,l,r));
    }
    private static boolean palindromeMethod(String str, int l, int r) {
        // Base case: when left index crosses or meets right index
        if (l >= r) return true;
        // Check current chars & move towards center
        return (str.charAt(l) == str.charAt(r) && palindromeMethod(str, l+ 1, r- 1));
    }
}
