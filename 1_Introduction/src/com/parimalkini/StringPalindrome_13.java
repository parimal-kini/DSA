package com.parimalkini;

import java.util.Scanner;

public class StringPalindrome_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();
        if (checkPalindrome(word))
            System.out.println("is a palindrome");
        else
            System.out.println("not a palindrome");
    }
    static boolean checkPalindrome(String word){
        int i = 0, j = word.length()-1;
        while (i<j){
            if(word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
