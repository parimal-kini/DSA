//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.
package com.parimalkini;

import java.util.Scanner;

public class NumbersWithEvenDigits_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();

        evenDigits(arr);
    }
    static void evenDigits(int[] arr){
        int count = 0;
        for (int i=0; i< arr.length; i++){
            int digits=0, n = arr[i];

            while (n != 0){
                n = n/10;
                digits++;
            }
            if (digits%2==0)
                count++;
        }
        System.out.println(count);
    }
}
