package com.parimalkini;

import java.util.Scanner;

public class Prime_Between_2_Numbers_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting point : ");
        int start =  scanner.nextInt();
        System.out.println("Enter an ending point : ");
        int end = scanner.nextInt();

        primeBetween(start, end);
    }
    static void primeBetween(int start, int end){
        int count;
        for(int i = start ; i <= end ; i++)
        {
            //logic for checking number is prime or not
            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if(i % j == 0)
                    count = count+1;
            }
            if(count == 2)
                System.out.println(i);
        }
    }
}
