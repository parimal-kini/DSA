package com.parimalkini;

public class ZB_Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        pattern28(n);
    }
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int toalColsInRow = row > n ? 2 * n - row : row;

            int numOfSpace = n - toalColsInRow;
            for (int space = 0; space < numOfSpace; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < toalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
