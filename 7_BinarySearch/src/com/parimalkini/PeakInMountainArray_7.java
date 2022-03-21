package com.parimalkini;

public class PeakInMountainArray_7 {
    public static void main(String[] args) {
        int[]arr = {0,1,3,5,7,8,10,9,6,2,-1};
//        int[]arr = {0,2,1,0};
        System.out.println(findPeak(arr));
    }
    static int findPeak(int[]arr){
        int start = 0, end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1])
               end = mid;
            else
                start = mid + 1;
        }
        return arr[start];
    }
}
