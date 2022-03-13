//          nPr = n!/(n-r)!
//          nCr = n!/[r! (n-r)!]

package com.parimalkini;

import java.util.Scanner;

public class nPr_nCr_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();

        int nPr, nCr, nFact=1, rFact=1, n_rFact=1,  n_r=0;

        if(n>=r)
            n_r = n-r;
        else
            System.out.println("Enter n>=r");

        for (int i=1; i<=n; i++)
            nFact *= i;
        for (int i=1; i<=r; i++)
            rFact *= i;
        for (int i=1; i<=n_r; i++)
            n_rFact *= i;
        System.out.println(n_rFact);
        nPr = nFact/n_rFact;
        nCr = nFact/(n_rFact)*rFact;

        System.out.println(n+"p"+r+" = "+nPr);
        System.out.println(n+"c"+r+" = "+nCr);
    }
}
