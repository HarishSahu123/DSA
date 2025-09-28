package org.practice.dsa.stack;

import java.util.Stack;

public class InsertAtPosition {



    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while (st.size()>0){
            st.push(st.pop());
            st.push(3);

        }
    }
    
}
