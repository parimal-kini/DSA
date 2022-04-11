package com.parimalkini;

public class ZE_Pattern31 {
    public static void main(String[] args) {
        int n = 5;
        pattern31(n);
    }
    static void pattern31(int n){
        int ogN = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = ogN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
