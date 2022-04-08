package com.parimalkini;

public class a_Performance {
    public static void main(String[] args) {
//        this is not an optimized approach as each time new obj is created in heap memory
//        "a","ab","abc","abcd",.....
//        String series = " ";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a' + i);
//            series += ch;
//        }
//        System.out.println(series);

//        more optimized approach would be to use StringBuilder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
//    this is more optimized approach because no new obj is created in heap
//    new char is added to existing "array" since StringBuilder is mutable and Strings aren't
}
