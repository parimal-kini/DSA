package com.parimalkini;

import java.util.Arrays;

public class dCyclicSort_4 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[]arr){
//        cyclic sort is used whenever the given array range is from 1-n
//        correct index of an element will always be value-1 since array are zero indexed
//        so first find the correct index and then swap
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }
    }
}