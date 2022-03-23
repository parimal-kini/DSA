package com.parimalkini;

public class MissingNumber_1 {
    public static void main(String[] args) {
        int[] arr = {1,0,4,2};
        System.out.println(cyclicSort(arr));
    }
    static int cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }
//        Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index)
                return index;
        }
//        Case 2
        return arr.length;
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
