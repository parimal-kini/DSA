package com.parimalkini;

import java.util.Scanner;

public class BattingAverage_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of runs scored : ");
        int runs = scanner.nextInt();
        System.out.print("Enter the total innings played : ");
        int innings = scanner.nextInt();
        System.out.print("Enter the number of times player was not out : ");
        int notOut = scanner.nextInt();

        int battingAvg = runs/(innings-notOut);

        System.out.println("The batting average is : "+battingAvg);
    }
}
