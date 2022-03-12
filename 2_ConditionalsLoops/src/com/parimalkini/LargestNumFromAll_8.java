package com.parimalkini;

import java.util.Scanner;

public class LargestNumFromAll_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        while (true){
            int n = scanner.nextInt();
            if(n>max)
                max=n;
            if(n==0)
                break;
        }
        System.out.println(max);
    }
}
