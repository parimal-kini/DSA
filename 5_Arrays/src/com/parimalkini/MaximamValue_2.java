package com.parimalkini;

import java.util.Scanner;

public class MaximamValue_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array : ");
        int[]arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        maxValue(arr);
    }
    static void maxValue(int[]arr){
        int max=0;
        for (int i=0; i< arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("The maximum value in array is : "+max);
    }
}
