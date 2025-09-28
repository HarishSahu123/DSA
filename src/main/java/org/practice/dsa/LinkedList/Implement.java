package org.practice.dsa.LinkedList;

public class Implement {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int val) {
            Node tempNode = new Node(val);

            if (head == null) {
                head = tempNode;
                tail = tempNode;
            } else {
                tail.next = tempNode;
                tail = tempNode;
            }
        }
        // Correct display method
        public static void display(Node head) {
            Node temp = head;  // use a temporary pointer so head is not changed
            while (temp != null) {
                System.out.print(temp.data + " "); // print data
                temp = temp.next; // move to next node
            }
            System.out.println(); // print newline after list
        }



        public int size() {
            int count = 0;
            Node temp = head; // use a temporary pointer so head is safe
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Insert at Specific location
        public void insertAtLocation(int idx, int val){
            Node newNode=new Node(val);
            Node temp=head;
            for (int i = 0; i <idx-1 ; i++) {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;

        }

        // Insert at the Beginning
        public void insertAtBeginning(int val){
            Node newNode=new Node(val);
            newNode.next=head;
            head=newNode;
        }

        // Insert at the end (without using tail)
        public void insertAtEnded(int val) {
            Node newNode = new Node(val);

            // Case 1: If list is empty
            if (head == null) {
                head = newNode;
                tail = newNode; // Keep tail updated
                return;
            }

            // Case 2: Traverse to the last node
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }

            // Insert at the end
            t.next = newNode;
            tail = newNode; // Update tail for efficiency
        }


        //getElement Method
        public void getElement(int idx){
            if(idx<0||idx>size()) {
                System.out.println("Invlid input");
            }
            Node t=head;
            for (int i = 0; i <idx ; i++) {
                t=t.next;
            }
            System.out.println(t.data);
        }

        // Delete node at a specific 1-based index
        public void deleteAtLocation(int idx) {
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index");
                return;
            }

            // Case 1: delete head node
            if (idx == 0) {
                head = head.next;
                if (head == null) tail = null; // list became empty
                return;
            }

            // Case 2: delete at given position
            Node t = head;
            for (int i = 0; i < idx - 1; i++) {
                t = t.next;
            }

            // Delete the node
            t.next = t.next.next;

            // If we deleted the last node, update tail
            if (t.next == null) {
                tail = t;
            }
        }

        public Node nthNodeFromStarting(int idx) {
            if (idx < 0) {
                return null; // Index should be 1-based (1 means first node)
            }
            int count=0;// Start counting from 1 for node
            Node temp=head;
            // Traverse until we reach the idx
            while (temp!=null&&count<idx){
                temp=temp.next;
                count++;
            }
            return temp;
        }


//        Nthnodefrom END
//        1.way to use formula ->nth term from end=(size()-n+1);
//        2.way to use two pointer -> first and second point both at same position
//        or can say this mehthod is in one travesal from the end of linked list



        public Node nthNodeFromEnd(int idx){
            //check
            if(idx<1 ) return null;
            Node temp=head;
            int steps = size() - (idx+1); // how many steps to move from head
            for (int i = 0; i <=steps; i++) {
                temp=temp.next;
            }

            return temp;
        }


        //    2.way    One Travsel
        public Node nthNodeFromEndSecondMethod(int idx){

            if( idx<0)return null;
            Node first=head;
            Node second=head;

            for (int i = 0; i <idx ; i++) {
                first=first.next;
            }
            while (first!=null){
                first=first.next;
                second=second.next;
            }


            return second;
        }


        //Removing Nth Node from end of The Linked List(in one travel)
        public void RemovingNthNodeFromEnd(int idx ){
            Node slow=head;
            Node fast=head;
            for (int i = 1; i <=idx ; i++) {
                fast=fast.next;
            }

            //if removing the head
            if(fast==null){
                head=head.next;
                return;
            }

            while (fast.next!=null){
                fast=fast.next;
                slow=slow.next;

            }
            slow.next=slow.next.next;
        }

        //Finding Intersection of Two Linked List(Two pinter rescuing)
        //Hints :01 find the size
        //Hint:02 increment bigger Linked list till (M-N)th term where M=bigger linked list ,
        // N=Small linked list size

        public static Node IntersectionNodeOfTwoLinkedList(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;
            int length1 = 0;
            int length2 = 0;

            // Count length of first list
            while (temp1 != null) {
                length1++;
                temp1 = temp1.next;
            }

            // Count length of second list
            while (temp2 != null) {
                length2++;
                temp2 = temp2.next;
            }

            // Reset pointers to start
            temp1 = head1;
            temp2 = head2;

            // Move the longer list ahead by difference
            if (length1 > length2) {
                int steps = length1 - length2;
                for (int i = 0; i < steps; i++) {
                    temp1 = temp1.next;
                }
            } else {
                int steps = length2 - length1;
                for (int i = 0; i < steps; i++) {
                    temp2 = temp2.next;
                }
            }

            // Traverse both together until intersection is found
            while (temp1 != temp2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            return temp1;  // returns intersection node or null if none
        }

        //Finding middle element of Linked List
//        Two type of linked list odd or even

//        1.way by Iteration find sizethen odd and even
//        2.one way transval to linked list


//        Best way by using slow and fast


//        Find the Minimum and Maximum Number of Nodes between Critical

//        Split Linked List in parts (lec resource)

//        Add Two Numbers [Leetcode-2] (lec resource)

        public static Node FindMiddleNode(Node head){
            Node fast=head;  // 1->2->3->4->5->6   //1->2->3-
            Node slow=head;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        //Create two linked list with is contains odd and even value of node
        public static void  oddAndEvenLinkedList(Node head){
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            Node evenhead=new Node(0);
            Node oddhead=new Node(0);

            // Temp pointers to traverse and build new lists
            Node current=head;
            Node even=evenhead;
            Node odd=oddhead;

            // Traverse original list
            while (current!=null){
            if(current.data%2==0){
                even.next=current;
                even=even.next;

            }else {
                odd.next=current;
                odd=odd.next;
            }
                current = current.next;
            }
            // IMPORTANT: Break links to avoid overlap
            even.next = null;
            odd.next = null;
            System.out.println("Even LinkedList");
            display(evenhead.next);
            System.out.println("Odd LinkedList");
            display(oddhead.next);
        }

        //Remove Duplicate from a Sorted list








        //Reverse Linked By Using Recurssion

        //Reverse Linked By Using Iteration

        //Reverse Linked List by using 
        public static Node reverserIteration(Node head){
            Node curr=head;
            Node perv=null;
            Node next=null;

            while (curr.next!=null){
                next=curr.next;
                curr.next=perv;
                perv=curr;
                curr=next;
            }
            return perv;
        }

        //chcck Palindrome two Wy
//        1. Create duplicate node
//        2. find middle-> reverse the secodnhalf -> comapare if yes then true else false



//        Maxium Sum of twin a Linked List




        



    }

        public static void main(String[] args) {

            linkedlist ll = new linkedlist();
            Node a=new Node(1);
            Node b=new Node(2);
            Node c=new Node(3);
            Node d=new Node(4);
            Node e=new Node(5);
            Node f=new Node(6);
            Node g=new Node(7);

            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            f.next=g;


            Node x=new Node(10);
            Node y=new Node(9);
            Node z=new Node(8);
//            linkedlist.oddAndEvenLinkedList(a);

//            x.next=y;
//            y.next=z;
//            z.next=e;
//            linkedlist.display(a);
            Node node = linkedlist.reverserIteration(a);

            linkedlist.display(node);
//            linkedlist.display(x);
//            Node insersectionNode = linkedlist.IntersectionNodeOfTwoLinkedList(a, x);
//            System.out.println(insersectionNode.data);
//            Node middleNode = linkedlist.FindMiddleNode(a);
//            System.out.println(middleNode.data);
//

//            ll.insertAtEnd(1);
//            ll.insertAtEnd(2);
//            ll.insertAtEnd(3);
//            ll.insertAtEnd(4);
//            ll.insertAtEnd(5);
//            ll.insertAtEnd(6);
//            ll.display();  // Output: 2 3 4
//            System.out.println(ll.size());
//
//            ll.insertAtLocation(0,5);
//            ll.display();
//            ll.insertAtBeginning(1);
//
//
//            ll.insertAtEnded(100);
//            ll.display();
//            ll.getElement(1);
//            ll.deleteAtLocation(5);
//            ll.display();
//
//
//            Node node = ll.nthNodeFromStarting(3);
//            System.out.println(node.data);
//            Node node1 = ll.nthNodeFromEnd(3);
//            System.out.println(node1.data);
//
//            Node node2 = ll.nthNodeFromEndSecondMethod(6);
//            System.out.println(node2.data);
//
//
//            ll.RemovingNthNodeFromEnd(8);
//            ll.display();

        }
}

