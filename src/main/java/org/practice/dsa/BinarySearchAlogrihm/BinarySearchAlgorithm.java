package org.practice.dsa.BinarySearchAlogrihm;
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int target=2;
        System.out.println(myBinarySearchMethod(arr, target));
    }
    private static boolean myBinarySearchMethod(int[] a, int target) {
        int left=0;
        int right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(a[mid]==target){
                return true;
            } else if (a[mid]>target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }return false;
    }


}
