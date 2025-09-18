package org.practice.dsa.Recursion.StringRecurrsion;

public class RemoveCharsFromString {
    public static void main(String[] args) {
        String str = "aaabbbccccdd";
        int n = str.length();
        int idx = 0;
        char c = 'c';

        System.out.println(removeCharsFromStringMethod(str, n, idx, c));
        System.out.println(removeCharsFromStringMethod02(str));
    }

    private static String removeCharsFromStringMethod(String str, int n, int i, char c) {
        // Base case
        if (i >= n) return "";

        // Recursive call
        String s = removeCharsFromStringMethod(str, n, i + 1, c);

        // Condition: if current character is NOT the one to be removed, add it
        if (str.charAt(i) != c) {
            return str.charAt(i) + s;  // Add current char before the recursive result
        } else {
            return s;  // Skip this character
        }
    }

    private static String removeCharsFromStringMethod02 (String s){
        if (s.length()==0)return"";
      String smallAns= removeCharsFromStringMethod02( s.substring(1));
      char currentAns=s.charAt(0);
        if (currentAns!='c') {
            return currentAns+smallAns;
        } else {
            return smallAns;
        }

    }
}
