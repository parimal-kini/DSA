package com.parimalkini;

import java.util.Arrays;

public class FirstAndLastPosition_5 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,8,8,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[] arr, int target){
        int ans[] = {-1,-1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[]arr, int target, boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = start + 1;
            else{
                ans = mid;
                if(firstStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
