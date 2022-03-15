//        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.

package com.parimalkini;

import java.util.Scanner;

public class Pangram_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of characters : ");
        String str = sc.nextLine();
        if(checkPangram(str))
            System.out.println("Sentence is a pangram");
        else
            System.out.println("Sentence is not a pangram");
    }
    static boolean checkPangram(String str){
        boolean[] mark = new boolean[26];

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return (false);
        return (true);
    }
}
