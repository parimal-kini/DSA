package com.parimalkini;

import java.util.Scanner;

public class CommissionPercentage_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sale price : ");
        float salePrice = scanner.nextFloat();

        System.out.print("Enter the commission percentage : ");
        float commissionPercentage = scanner.nextFloat();

        float commissionRate = (salePrice*commissionPercentage)/100;

        System.out.println("Commission rate for the transaction is : "+commissionRate);
    }
}

