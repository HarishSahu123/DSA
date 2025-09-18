package org.practice.dsa.array.basicArray.oneDimension.basi;

public class ReverseOfTheArray {
    static void printArray(int [] x){
        for (int i = x.length-1; i > 0; i--) {
            System.out.print(x[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n =arr.length;
        printArray(arr);
    }

}
