//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the target : ");
        int target = sc.nextInt();

        findTwoSum(arr, target);
    }
    static void findTwoSum(int[]arr, int target){
        int[] ans = new int[2];
        int flag = 0;
        for (int i=1; i< arr.length; i++){
            int sum = arr[flag]+arr[i];
            if(sum == target)
                ans = new int[]{flag, i};
            flag++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
