package com.parimalkini;

import java.util.Scanner;

public class ReverseString_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.next();
        String revStr = "";
        char ch;
        for (int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            revStr = ch+revStr;
        }
        System.out.println("Reverse of string is : "+revStr);
    }
}
