package com.parimalkini;

public class ZD_Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        pattern30(n);
    }
    static void pattern30(int n){
        for (int row = 0; row < n; row++) {
            int toalColsInRow = row > n ? 2 * n - row : row;

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
