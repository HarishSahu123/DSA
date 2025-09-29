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

//                        10
//                     /      \
//                     5        20
//                    / \      / \
//                   3   7    15  25
//                   /              \
//                  1                17


    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(5);
        Node b=new Node(20);
        root.left=a;
        root.right=b;
        Node c=new Node(3);
        Node d=new Node(7);
        a.left=c;
        a.right=d;
        Node e=new Node(15);
        Node f=new Node(25);
        b.left=e;
        b.right=f;
        Node g=new Node(1);
        c.left=g;
        Node h=new Node(17);
        e.right=h;
        displayTree(root);
        System.out.println();
        System.out.println();
        preorder(root);
        System.out.println();
        postOrder(root);
    }

    //In order Transvel print
    public static void displayTree(Node root){
        if(root==null)return;
        if(root!=null){
            displayTree(root.left);
            System.out.print(root.val + " " );
            displayTree(root.right);
        }

    }
    // Preorder: Root -> Left -> Right

    public static void preorder (Node root){
        if(root==null) return;
        if(root!=null){
            System.out.print(root.val + " " );
            preorder(root.left);

            preorder(root.right);
        }

    }

    public static void postOrder (Node root){
        if(root==null) return;
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " " );
        }
    }

    //Size =Number of nodes;
    //Height =Size-1;
    //Level=generations;
    //Number of edges
    //Sum of Tree of Nodes
    // Maximum node
    // minimum node
    // Leaf Node= Number of Children has 0
    // Internal Node=
    //

    public static void sizeOfTree(Node node){

    }
}
