package com.parimalkini;

import java.util.Arrays;

public class EvenDigits_6 {
    public static void main(String[] args) {
        int[]arr = {1,2222,3212,42,5} ;
        check(arr);
    }
    static void check(int[]arr){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            int digits=0, n = arr[i];

            while (n != 0){
                digits++;
                n = n/10;
            }
            if (digits%2==0)
                count++;
        }
        System.out.println(count);
        }
    }
