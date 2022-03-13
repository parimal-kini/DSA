package com.parimalkini;

import java.util.Scanner;

public class CGPA_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects : ");
        float subs = scanner.nextFloat();
        float subTotal = subs*100;

        System.out.print("Enter the total number of marks scored in all the subjects : ");
        float marks = scanner.nextFloat();

        float percent = (float) (marks / subTotal) * 100;
        System.out.println("Percentage : "+percent);
        float cgpa = (float) (percent/9.5);
        System.out.println("CGPA is : "+cgpa);
    }
}
