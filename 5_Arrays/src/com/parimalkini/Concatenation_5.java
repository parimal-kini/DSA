//arr[] = {1,2,3,4,5}
//ans[] = {1,2,3,4,5,1,2,3,4,5}

package com.parimalkini;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        concatenation(arr);
    }
    static void concatenation(int[] arr){
        int ans[] = new int[arr.length*2];
        for (int i=0; i< arr.length; i++){
            ans[i] = arr[i];
            ans[i+arr.length] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
