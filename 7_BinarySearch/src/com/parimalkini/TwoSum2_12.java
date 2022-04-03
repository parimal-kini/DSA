package com.parimalkini;

import java.util.Arrays;

public class TwoSum2_12 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target  = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int start = 0, end = numbers.length - 1;
        while (start <= end){
            if(numbers[start] + numbers[end] == target){
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }
            else if(numbers[start] + numbers[end] < target)
                start++;
            else
                end--;
        }
        return ans;
    }
}
