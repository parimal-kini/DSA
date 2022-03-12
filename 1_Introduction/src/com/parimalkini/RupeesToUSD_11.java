package com.parimalkini;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RupeesToUSD_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of Rupees : ");
        float rupees = sc.nextFloat();

        System.out.println("Enter the rate of USD : ");
        float dollars = sc.nextFloat();
        dollars = rupees/dollars;

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println(df.format(dollars));
    }
}
