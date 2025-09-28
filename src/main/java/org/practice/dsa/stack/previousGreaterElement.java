package org.practice.dsa.stack;

import java.util.Stack;

public class previousGreaterElement {
    public static void main(String[] args) {
        int [] arr={10, 5, 8, 3, 12, 7};
        int [] res=previousGreaterElementMethod(arr);
        int n=res.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(res[i]+ " ");
        }
    }

    private static int[] previousGreaterElementMethod(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int [] result=new int[arr.length];
        int n=arr.length;
        for (int i = 0; i < n; i++) { // include last element as well
            // Pop elements that are smaller or equal because they can't be PGE
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            // If stack is empty → no greater element on left
            if(st.size()==0){
               result[i]=-1;
            }else {
                result[i]=st.peek();// top is the previous greater element
            }
            // Push current element for future elements
            st.push(arr[i]);
        }
        return result;
    }
}
