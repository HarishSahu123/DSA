package org.practice.dsa.queues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class BasicSTL {

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(3);
        q.add(4);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.size());
        q.remove();
        System.out.println(q);


    }

    }

