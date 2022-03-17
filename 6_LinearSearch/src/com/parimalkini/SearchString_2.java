package com.parimalkini;

public class SearchString_2 {
    public static void main(String[] args) {
        String str = "parimal";
        char ch = 'z';

        System.out.println(search(str,ch));
    }
    static boolean search(String str, char ch){
        if(str.length()==0)
            return false;

        for (int i = 0; i <str.length(); i++) {
            if (ch == str.charAt(i))
                return true;
        }
        return false;
    }
}
