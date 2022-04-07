package com.parimalkini;

public class hMissingNumber_8 {
    public static void main(String[] args) {
        int[] arr = {1,0,4,2};
        System.out.println(cyclicSort(arr));
    }
        static int cyclicSort(int[]arr){
        int i = 0;
        while (i < arr.length){
//            since array is starting from 0 correct index of numbers will be i
            int correct = arr[i];
//            if(arr[i] < arr.length && arr[i] != arr[arr[i]])
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }
//        now the array is sorted we can find the missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j)
                return j;
        }
//        if element not found in sorted array means last element is missing
        return arr.length;
    }
}