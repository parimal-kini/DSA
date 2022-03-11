package com.parimalkini;

import java.util.Scanner;

public class SumOfTwoNum_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scanner.nextInt();

        System.out.println("Sum of both numbers is : "+(a+b));
    }
}
