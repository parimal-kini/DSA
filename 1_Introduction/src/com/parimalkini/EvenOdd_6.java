package com.parimalkini;

import java.util.Scanner;

public class EvenOdd_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int n = sc.nextInt();
        check(n);
    }
    static void check(int n){
        if(n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
