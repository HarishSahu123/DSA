package org.practice.dsa.tree;

import org.practice.dsa.LinkedList.Implement;

public class Implementation {
    public static  class Node{
        int val;//Initiation value=null
        Node left;//Initiation value=null
        Node right;//Initiation value=null

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(1);
        Node b=new Node(9);
        root.left=a;
        root.right=b;
        Node c=new Node(2);
        Node d=new Node(3);
        a.left=c;
        a.right=d;
        Node e=new Node(4);
        Node f=new Node(5);
        b.left=e;
        b.right=f;

    }

    public static void displayTree(Node root){
        if(root==null)return;
        System.out.print(root.val + "->" );
        if(root.left!=null){
            System.out.print(root.left.val+ ",");
        }if(root.right!=null){
            System.out.println(root.right.val + " ");
        }
        displayTree(root.left);
        displayTree(root.right);
    }


}
