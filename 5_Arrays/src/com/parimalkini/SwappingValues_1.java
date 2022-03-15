package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingValues_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array : ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index you want to swap : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Arrays.toString(swap(arr, a, b)));
    }
    static int[] swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr;
    }
}
