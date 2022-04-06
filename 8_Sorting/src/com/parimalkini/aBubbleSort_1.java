package com.parimalkini;

import java.util.Arrays;

public class aBubbleSort_1 {
    public static void main(String[] args) {
        int[] arr = {11,3,2,5,4,1,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
//        with each pass largest number will go at the end
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            checking the current number with its previous number if current num smaller then it will swap
//            so that the larger number will keep moving towards end
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
