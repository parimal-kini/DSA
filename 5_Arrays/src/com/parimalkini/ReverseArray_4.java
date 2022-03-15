package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        reverse(arr);
    }
    static void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
