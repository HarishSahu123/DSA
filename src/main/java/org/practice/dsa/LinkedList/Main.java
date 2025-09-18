package org.practice.dsa.LinkedList;


import javafx.scene.Node;

public class Main {
    class  Node {
        public int data;
        public Node next;
        public Node(int value) {
            this.data = value;
            this.next = null;
        }


    }
    public static void displayLinkedListIterative(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void displayLinkedListRecursive(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        displayLinkedListRecursive(head.next);
    }


    public static int findLengthIterative(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    // Insert at End of the list
    public Node insertAtEnd(Node head, int value) {
        Node temp = new Node(value);
        if (head == null) {
            return temp;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return head;
    }



    public  void main(String[] args) {
        Node a = new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.print("Iterative Display: ");
        displayLinkedListIterative(a);
        System.out.print("Recursive Display: ");
        displayLinkedListRecursive(a);
        System.out.println();
        insertAtEnd(a,2);
        displayLinkedListIterative(a);



        System.out.println(findLengthIterative(a));
    }
}