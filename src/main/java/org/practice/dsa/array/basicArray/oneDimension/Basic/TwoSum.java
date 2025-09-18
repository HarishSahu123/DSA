package org.practice.dsa.array.basicArray.oneDimension.Basic;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={ 1, 4,2,3,5,6,7};
        int t=10;

        int n=arr.length;
        //Solution
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]+arr[j]==t){
                    System.out.println(arr[i] + " "+arr[j]);
                   // break;
                }
            }

        }


    }
}
