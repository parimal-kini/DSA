package com.parimalkini;

import java.util.Locale;

public class b_Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
//        str = str.toLowerCase();
        if(str == null || str.length() == 0)
            return false;
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end)
                return false;
        }
        return true;
    }
}
