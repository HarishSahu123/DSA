package org.practice.dsa.array.basicArray.oneDimension.basi;

public class ReverseOfArrayByTwoPointer {
    static void printArray(int [] x){
        for (int i =0; i < x.length; i++) {
            System.out.print(+x[i] +" ");
        }
        System.out.println();
    }


    static void reverseArray(int [] y){
        int left=0;
        int right=y.length-1;
        while (left<right){

            int temp=y[left];
             y[left]=y[right];
             y[right]=temp;
             right--;
             left++;
        }
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n =arr.length;
        System.out.println("The original Array:");
        printArray(arr);

        reverseArray(arr);
        System.out.println("The reverse Arry:");
        printArray(arr);

    }
}
