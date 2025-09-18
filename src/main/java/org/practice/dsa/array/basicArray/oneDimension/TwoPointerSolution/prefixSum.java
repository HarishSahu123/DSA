package org.practice.dsa.array.basicArray.oneDimension.TwoPointerSolution;

public class prefixSum {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int n=arr.length;


        makeprefixSumOfArray(arr);



    }
    static int[] makeprefixSumOfArray(int[] arr){
        int n=arr.length;

        // Print and keep arr[0] as is
        System.out.print(arr[0] + " ");

        for (int i = 1; i < n; i++) {
            arr[i] =arr[i-1]+arr[i];
            //arr[i]+=arr[i-1];

            System.out.print(arr[i] +" ");
        }
        System.out.println();
        return arr;
    }
}
