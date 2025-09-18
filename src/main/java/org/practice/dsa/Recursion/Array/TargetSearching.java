package org.practice.dsa.Recursion.Array;

public class TargetSearching {
    public static void main(String[] args) {
        //Sorting Array
        int [] arr={1,2,34,56,77,86,87,75};
        //Target
        int target=75;
        int idx=0;
        System.out.println( targetSearchingMethod(arr,target,idx));
    }

    private static int targetSearchingMethod(int[] arr, int target, int idx) {
        if(idx==arr.length)return -1;
        if(arr[idx]==target)return idx;
        int i = targetSearchingMethod(arr, target, idx + 1);
        return i;
    }
}
