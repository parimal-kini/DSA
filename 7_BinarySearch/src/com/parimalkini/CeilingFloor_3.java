package com.parimalkini;

public class CeilingFloor_3 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,11,15,19,22,25,30,35,39,45};
        int target = 17;
        ceilingFloor(arr, target);
    }
    static void ceilingFloor(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else {
                System.out.println(arr[mid]);
                break;
            }
        }
        System.out.println("Ceiling of "+target+" is : "+arr[start]);
        System.out.println("Floor of "+target+" is : "+arr[end]);
    }
}
