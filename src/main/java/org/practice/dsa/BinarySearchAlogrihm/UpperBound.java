package org.practice.dsa.BinarySearchAlogrihm;

public class UpperBound {
//    Upper Bound Meaning (DSA / Sorted Array)
//    Definition:
//    Upper Bound ek sorted array me wo first index hota hai jahan element strictly target se bada ho.
//    Matlab: “pehla element jo target se bigger hai”.
//    Agar target array me duplicate hai, upper bound hamesha duplicates ke baad ka index deta hai.
    public static void main(String[] args) {

        int[] arr={-5, -2, 0, 1, 5, 6, 7, 8, 10};
        int n=arr.length-1;
        int target=1;
        System.out.println(upperBoundMehod(arr,target));

    }

    private static int upperBoundMehod(int[] arr, int target) {
        int ans = arr.length; // default: no element > target
        int st=0;
        int end =arr.length-1;
        while (st<=end){
           int mid=st+(end-st)/2;
           if(arr[mid]>target){
               ans=mid;
               end = mid - 1; // check left side
           }else {
               st = mid + 1;  // go right
           }
        }return ans;//Not found
    }
}
