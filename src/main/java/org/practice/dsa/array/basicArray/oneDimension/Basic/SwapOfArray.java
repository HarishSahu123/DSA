package org.practice.dsa.array.basicArray.oneDimension.Basic;

public class SwapOfArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;//7
        System.out.println(n);
        printArray(arr);

    }


//    static int[] swap(int[] arr){
//
//
//        return ;
//    }

    static void printArray(int [] brr){
        for (int i = 0; i <brr.length; i++) {
            System.out.print( brr[i]+ " ");
        }
        System.out.println();
    }

}
