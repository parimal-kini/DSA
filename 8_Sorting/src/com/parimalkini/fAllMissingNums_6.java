package com.parimalkini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fAllMissingNums_6 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(cyclicSort(arr));
    }
    static List<Integer> cyclicSort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
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
}
