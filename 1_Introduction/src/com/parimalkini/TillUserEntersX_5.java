package com.parimalkini;

import java.util.Scanner;

public class TillUserEntersX_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the numbers to add, enter 'x' to exit :");
        int sum = 0;
        while (!sc.hasNext("x")){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
