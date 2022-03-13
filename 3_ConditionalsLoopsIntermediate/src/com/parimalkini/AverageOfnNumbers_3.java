package com.parimalkini;

import java.util.Scanner;

public class AverageOfnNumbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int avg=0;

        for (int i=1; i<=n; i++)
            avg +=i;

        System.out.println(avg/n);
    }
}
