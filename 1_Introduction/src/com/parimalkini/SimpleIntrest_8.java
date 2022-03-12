package com.parimalkini;
import java.util.Scanner;

public class SimpleIntrest_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        double p = scanner.nextDouble();
        System.out.println("Enter Time : ");
        int t = scanner.nextInt();
        System.out.println("Enter Rate of Intrest : ");
        double r = scanner.nextDouble();

        double si = (p*r*t)/100;
        System.out.println("Simple Intrest = "+si);
        System.out.println("Total = "+(si+p));

    }
}
