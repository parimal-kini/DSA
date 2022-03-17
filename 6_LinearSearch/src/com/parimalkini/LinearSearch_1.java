package com.parimalkini;

import java.util.Scanner;

public class LinearSearch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        System.out.println(search(arr, target));
    }

     static int search(int[] arr, int target) {
         for (int i = 0; i <arr.length ; i++) {
             if(arr[i] == target)
                 return i;
         }
         return -1;
    }
}
