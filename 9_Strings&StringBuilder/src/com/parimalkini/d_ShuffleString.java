package com.parimalkini;

public class d_ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
    static String restoreString(String s, int[] indices) {
        char[] str = new char[s.length()];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            str[indices[i]] = s.charAt(i);
        }
        for(char c: str)
            ans += c;
        return ans;
    }
}
