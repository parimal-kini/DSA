package com.parimalkini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNums {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(cyclicSort(arr));
    }
    static List<Integer> cyclicSort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
//        Search for all missing numbers and store in a array list
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
