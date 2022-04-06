package com.parimalkini;

import java.util.Arrays;

public class bSelectionSort_2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
//          -i  as the loop increments and value of i increases we go from last to 2nd last and so on...
//            and -1 because arrays are 0 indexed, so last element will be array.length -1
            int lastPos = arr.length - i - 1;
            int maxNumIndex = getMaxNumIndex(arr, 0, lastPos);
            swap(arr, maxNumIndex, lastPos);
        }
    }
    static int getMaxNumIndex(int[]arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
    static void swap(int[]arr, int maxNumIndex, int last){
        int temp = arr[maxNumIndex];
        arr[maxNumIndex] = arr[last];
        arr[last] = temp;
    }
}