package com.parimalkini;

import java.util.Scanner;

public class MaxValueGivenRange_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        maxValue(arr, start, end);
    }
    static void maxValue(int[]arr, int start, int end){
        int max=arr[start];
        for (int i=start; i< end; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("The maximum value in array is : "+max);
    }
}
