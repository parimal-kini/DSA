package com.parimalkini;

public class C_Pattern3 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
//            for (int col = 5; col > row; col--) {
            for (int col = 1; col <= 5-row-1; col++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
