package com.parimalkini;

import java.util.Scanner;

public class MinMaxInRange_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter a starting point : ");
        int start = sc.nextInt();
        System.out.println("Enter a ending point : ");
        int end = sc.nextInt();

        search(arr, start, end);
    }
    static void search(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = start; i <end ; i++) {
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Maximum value is : "+max);
        System.out.println("Minimum value is : "+min);
    }
}
