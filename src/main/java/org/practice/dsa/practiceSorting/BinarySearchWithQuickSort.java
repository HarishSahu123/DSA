package org.practice.dsa.practiceSorting;

public class BinarySearchWithQuickSort {

    public static void main(String[] args) {
        int[] arr={2,3,52,6,2,6,7,2,6,8,1,3,3,23,53,43,64,64};
        int target=5;
        System.out.println("original Array : ");
        printArray(arr);
    }

    // <<------------------ QuickSort ------------------>>>

    

    static void printArray(int []a ){
        for (int val:a){
            System.out.print(val+ " ");
        }
        System.out.println( );
    }
}
