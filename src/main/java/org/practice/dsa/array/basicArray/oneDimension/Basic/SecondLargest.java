package org.practice.dsa.array.basicArray.oneDimension.Basic;

public class SecondLargest {

    public static void main(String[] args) {
        int [] arr={1,2,3,4 , 5, 6,10,7,8,9,0};
        int max=arr[0];
        //int max=Integer.MIN_VALUE;

       // int smax=Integer.MIN_VALUE;  =====int smax=arr[0]; both are same
        int smax=arr[0];


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] !=max && arr[i]>smax){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }

}
