//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        runningSum(arr);
    }
    static void runningSum(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i=1; i< ans.length; i++)
            ans[i] = ans[i-1]+arr[i];

        System.out.println(Arrays.toString(ans));
    }
}
