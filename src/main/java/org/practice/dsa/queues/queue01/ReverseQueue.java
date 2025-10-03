package org.practice.dsa.queues.queue01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        while (!queue.isEmpty()){
            st.push(queue.remove());
        }
        while (!st.isEmpty()){
            queue.add(st.pop());
        }
        System.out.println(queue);
    }
}
