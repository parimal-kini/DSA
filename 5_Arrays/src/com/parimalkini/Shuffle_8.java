//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = scanner.nextInt();

        int[] arr = new int[n*2];
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i< arr.length; i++)
            arr[i] = scanner.nextInt();

        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int[] shuffle(int[] arr, int n){
        int[] result = new int[arr.length];

        for (int i=0; i<n; i++)
            result[i*2] = arr[i];

        for (int j=1; j<n+1; j++)
            result[(j*2)-1] = arr[(n+j)-1];

        return result;
    }
}
