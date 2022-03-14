package com.parimalkini;

import java.util.Scanner;

public class Palindrome_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        palindrome(n);
    }

    static void palindrome(int n){
        int rev;
        int sum = 0;
        int og = n;

        while (n>0){
            rev = n%10;
            sum = (sum*10)+rev;
            n = n/10;
        }
        if(sum == og)
            System.out.println(og+" is a palindrome.");
        else
            System.out.println(og+" is not a palindrome");
    }
}
