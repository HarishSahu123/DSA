package org.practice.dsa.queues;

public class ArrayImplementation {

    public static class Queue{
        int [] arr=new int[100];
        int f=-1;
        int r=-1;
        int size=0;
        int n=arr.length;

        //Keep that mind for add method always focus on rear(r) point
        //And reomve focus on fornt(f)
        public void add(int val){
          if(size==n){
              System.out.println("Queue is full");
              return;
          }
          if (size == 0) {
                f = r = 0;
            } else {
                r++;
            }
            arr[r] = val;
           size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Empty");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;

            return x;
        }
        public void  size(){
            System.out.println(size+" ");
        }

        public void display(){
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public boolean isEmpty(Queue queue){
            if(size==0)return true;
            else return false;
        }



    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.display();
        queue.size();


    }
}
