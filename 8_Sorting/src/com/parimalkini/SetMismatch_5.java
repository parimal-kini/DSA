package com.parimalkini;

import java.util.Arrays;

public class SetMismatch_5 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findMismatch(arr)));
    }
    static int[] findMismatch(int[] arr){
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    i++;
                }
            }

            // search for first missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    return new int[] {arr[index], index+1};
                }
            }
            return new int[] {-1, -1};
        }
    }

