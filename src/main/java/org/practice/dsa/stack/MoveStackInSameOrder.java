package org.practice.dsa.stack;

import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack " + st);
        //move into another stack
        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            gt.push(x);
            st.pop();

        }
        System.out.println(gt);
        System.out.println(st);
        Stack<Integer> tt = new Stack<>();

        while (gt.size() > 0) {
            int x = gt.peek();
            tt.push(x);
            gt.pop();
        }
        System.out.println("Copy but In same Order:" + tt);
        //insert At buttom
        while (st.size() > 0) {
            int x = st.peek();
            gt.push(x);
            st.pop();
        }


     }
    }

