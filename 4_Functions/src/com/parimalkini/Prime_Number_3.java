package com.parimalkini;

import java.util.Scanner;

public class Prime_Number_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        if(prime(n))
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }
    static boolean prime(int n){
        if(n<=1)
            return false;

        for(int i=2; i<n; i++)
            if(n%i==0)
                return false;

            return true;
    }
}
