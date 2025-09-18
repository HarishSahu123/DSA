package org.practice.dsa.Recursion.Array;

import java.util.ArrayList;

public class FindAllIndices {
    public static void main(String[] args) {
        int [] arr={6,7,6,6};
        int n=arr.length;
        int target=6;
        int idx=0;
        System.out.println(FindAllIndicesmethod( arr,n,target,idx));
    }
    private static  ArrayList<Integer> FindAllIndicesmethod(int[] arr, int n, int target, int idx) {
        if(idx>=n)return new ArrayList<>() ;//return empty arraylist
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(arr[idx]==target){
            arrayList.add(idx);
        }
        ArrayList<Integer> smallans=FindAllIndicesmethod(arr,n,target,idx+1);
        arrayList.addAll(smallans);
        return arrayList;
    }


}
