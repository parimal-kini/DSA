package com.parimalkini;

import java.util.Scanner;

public class GoingOutEvenDays_24 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=31; i++) {
            if (i % 2 == 0)
                sum++;
        }
        System.out.println(sum);
    }
}
