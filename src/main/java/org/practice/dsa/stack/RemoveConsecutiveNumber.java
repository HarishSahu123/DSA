package org.practice.dsa.stack;

import java.util.Stack;

public class RemoveConsecutiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 0};
      //int[] res = removeConscutive(arr);

//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i] + " ");
//        }
    }

//    private static int[] removeConscutive(int[] arr) {
//
//
//    }


}



//    private static int[] removeConscutive(int[] arr) {
//        Stack<Integer> st = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int a = arr[i];
//            // Push only if stack empty or different element
//            if (st.isEmpty() || st.peek() != a) {
//                st.push(a);
//            } else {
//                // If duplicate found, remove the top if it's the end of duplicates
//                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
//                    st.pop();
//                }
//            }
//        }
//        // Convert stack to array in correct order
//        int[] result = new int[st.size()];
//        for (int i = st.size()-1; i >= 0; i--) {
//            result[i] = st.pop();
//        }
//
//        return result;
//    }
