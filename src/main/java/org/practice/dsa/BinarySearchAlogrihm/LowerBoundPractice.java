package org.practice.dsa.BinarySearchAlogrihm;

public class LowerBoundPractice {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int taeget=3;

        int i = lowerboundMethos(arr, taeget);
        System.out.println(i);
    }

    private static int lowerboundMethos(int[] arr,  int taeget) {

        int lo = 0;
        int hi = arr.length - 1;
        int ans=arr.length; // default if target > all elements
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= taeget) {
                ans = mid;
                hi = mid - 1;  // search in left half
            }else {
                lo=mid+1;//go right
            }
        }
        return ans;
    }


}
