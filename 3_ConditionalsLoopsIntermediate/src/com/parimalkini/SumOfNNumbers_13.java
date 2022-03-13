package com.parimalkini;

import java.util.Scanner;

public class SumOfNNumbers_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number till you want to add : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++)
            sum+=i;
        System.out.println("Addition till "+n+" is : "+sum);
    }
}
