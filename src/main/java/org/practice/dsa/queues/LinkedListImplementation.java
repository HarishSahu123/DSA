package org.practice.dsa.queues;


public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;


        public Node(int val) {
            this.val = val;
        }

     }
    public static class Queue{
        Node font=null;
        Node rear=null;
        int size;

        public void add(int val){
            Node temp=new Node(val);

            if(size==0){
                font=rear=temp;
            }else {
                rear.next=temp;
                rear=temp;
            }
            size++;
        }

        public void display(Queue node){
            if(size==0){
                System.out.println("EMpty");
            }else {
                Node temp = font;
                System.out.print("Queue elements: ");
                while (temp != null) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;

            }
            int x = font.val;
            font = font.next;
                size--;
                return x;
        }

        public void size(Queue queue){
            System.out.println(size+ "");
        }

        public boolean isEmpty(Queue queue){
           if(size==0)return true;
           return false;
        }

        public int peak(Queue queue){
            return font.val;
        }



    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.display(queue);
        queue.remove();
        queue.display(queue);
    }


}
