package com.parimalkini;

import java.util.Scanner;

public class ProductAndSumOfInt_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n;

        int product = 1, addition=0;

        for(int i=0; i<=n; i++){
            product *= n%10;
            n=n/10;
        }
        System.out.println(product);

        for(int i=0; i<=m; i++){
            addition += m%10;
            m=m/10;
        }
        System.out.println(addition);

        int sub = product-addition;
        System.out.println(sub);
    }
}
