package org.practice.dsa.BinarySearchAlogrihm;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,5,6,7,8,9,10};
        int taeget=3;
        int n=arr.length;
        int lb=n;
        int i = lowerBoundMethod(arr, taeget);
        System.out.println(i);
    }

    private static int lowerBoundMethod(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int ans = arr.length; // default = not found, goes to n

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] >= target) {
                ans = mid;      // possible lower bound
                end = mid - 1;  // try to go left
            } else {
                st = mid + 1;   // go right
            }
        }
        return ans;
    }
}
