package com.parimalkini;

import java.util.Scanner;

public class PowerInJava_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        System.out.print("Enter the power of the number : ");
        int p = scanner.nextInt();

        int power = (int) Math.pow(n,p);

        System.out.println(n+"^"+p+" : "+power);
    }
}

