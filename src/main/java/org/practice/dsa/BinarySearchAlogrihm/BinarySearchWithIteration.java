package org.practice.dsa.BinarySearchAlogrihm;

public class BinarySearchWithIteration {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        printArry(arr);
        System.out.println( BinarySearchMethod(arr, 5));
    }

    static  int BinarySearchMethod(int [] k ,int target ){
        int left=0;
        int right=k.length-1;

        while (left<=right){
            int mid = left + (right - left) / 2;
            if(k[mid]==target){
                return mid;//Found mid
            }
            if(target < k[mid]) {
                right = mid - 1; // move to left half}
        }else {
            left=mid+1;
            }
        }
        return -1;//Not Found
    }

    static  void printArry(int []a){
        for (int val:a){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
