package com.parimalkini;

public class BinarySearch_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,33,44,55,66,78,88,98,99,123,134,155};
        int target = 123;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//        int mid = start + (end - start)/2; doesn't work when mid is initialized outside while loop

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
