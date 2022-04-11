package com.parimalkini;

public class F_Pattern6 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < row; col++) {
                System.out.println(" ");
            }
            System.out.println("*");
        }
    }
}
