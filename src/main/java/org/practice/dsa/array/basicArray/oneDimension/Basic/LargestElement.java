package org.practice.dsa.array.basicArray.oneDimension.Basic;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 40, 18};

        int max=arr[0];

        System.out.println(arr[0]);
        for (int i = 0; i < 5; i++) {
            if (arr[i]> max){
                max=arr[i];
            }

        }
        System.out.println("largest eleemt "+max);
    }


}
