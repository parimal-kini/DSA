package com.parimalkini;

import java.util.Scanner;

public class Factorial_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        System.out.println("factorial of "+n+" is : "+factorial(n));
    }

    static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++)
            fact *= i;

        return fact;
    }
}
