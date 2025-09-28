package org.practice.dsa.LinkedList;

public class RandomPointLinkedList {

    private static class Node {
        int data;

        Node Next;

        Node random;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            Next = next;
        }

        public Node(int data, Node next, Node random) {
            this.data = data;
            Next = next;
            this.random = random;
        }
    }
    //Copy LinkedList with Random Number


    public static void main(String[] args) {

    }
}
