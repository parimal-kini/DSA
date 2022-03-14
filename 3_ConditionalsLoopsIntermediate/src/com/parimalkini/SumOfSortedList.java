package com.parimalkini;

import java.util.Scanner;

public class SumOfSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSum=0, eSum=0, oSum=0;
        System.out.println("Enter a list of numbers to exit press '0' : ");
        while (!sc.hasNext("0")){
            int n = sc.nextInt();
            if(n<0)
                nSum+=n;
            else if(n%2==0)
                eSum+=n;
            else
                oSum+=n;
        }
        System.out.println("Sum of negative numbers  = " + nSum);
        System.out.println("Sum of positive even numbers  = " + eSum);
        System.out.println("Sum of positive odd numbers  = " + oSum);
    }
}
