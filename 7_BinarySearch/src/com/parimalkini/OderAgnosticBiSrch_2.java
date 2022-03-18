package com.parimalkini;

public class OderAgnosticBiSrch_2 {
    public static void main(String[] args) {
//        int[] arr = {1,2,33,44,55,66,78,88,98,99,123,134,155};
        int[] arr = {200, 197, 185, 176, 165, 154, 143, 137, 122, 111, 10, 1, 0,-12};
        int target = -1;
        System.out.println(oderAgnosticBiSrch(arr, target));
    }
    static int oderAgnosticBiSrch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;

            if(isAsc){
                if(target < arr[mid])
                    end = mid - 1;
                else if(target > arr[mid])
                    start = mid + 1;
            }else {
                if(target > arr[mid])
                    end = mid - 1;
                else if(target < arr[mid])
                    start = mid + 1;
            }
        }
        return -1;
    }
}
