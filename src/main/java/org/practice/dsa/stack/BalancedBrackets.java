package org.practice.dsa.stack;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Boolean balancedBrackets = isBalancedBrackets(s);
        System.out.println(balancedBrackets);
    }

    private static Boolean isBalancedBrackets(String s) {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c=='('){
                st.push(c);
            } else if (c==')') {
                if(st.isEmpty()|| st.peek()!='('){
                    return false; // unmatched closing bracket
                }
                else st.pop();
            }

        }
        if(st.size()>0)return false;
        else return true;
    }
}
