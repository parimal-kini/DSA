package com.parimalkini;

import java.util.Scanner;

public class DiscountOnProduct_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost of product : ");
        int cost = scanner.nextInt();
        System.out.print("Enter the discount rate : ");
        int discount = scanner.nextInt();

        int discountAmt = cost * discount/100;

        System.out.println("Total discount is : "+discountAmt);
    }
}
