//        Input: nums = [8,1,2,2,3]
//        Output: [4,0,1,1,3]
//        Explanation:
//        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//        For nums[1]=1 does not exist any smaller number than it.
//        For nums[2]=2 there exist one smaller number than it (1).
//        For nums[3]=2 there exist one smaller number than it (1).
//        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
//
//                Example 2:
//
//                Input: nums = [6,5,4,8]
//                Output: [2,1,0,3]

package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanCurrentNum_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(check(arr)));
    }

    static int[] check(int[] arr){
        int[] ans = new int[arr.length];
        for (int i=0; i< ans.length; i++){
            int count = 0;
            for (int j=0; j< ans.length; j++){
                if(arr[i] > arr[j])
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}
