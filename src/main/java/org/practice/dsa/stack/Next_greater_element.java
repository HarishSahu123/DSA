package org.practice.dsa.stack;

import java.util.Stack;

public class Next_greater_element {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,4,5,6,7,8,9};
        int[] res=nextgreater(arr);
    }

    private static int[] nextgreater(int[] arr) {
        int n=arr.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-2; i>= 0; i--) {
            while (st.peek()<arr[i]  && st.size()>0){
                st.pop();
            }
            if(st.size()==0)result[i]=-1;
            else result [i]=st.peek();
            st.push(arr[i]);
        }return result;

    }

}
