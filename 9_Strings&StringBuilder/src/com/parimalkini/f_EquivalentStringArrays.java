package com.parimalkini;

public class f_EquivalentStringArrays {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        if (arrayStringsAreEqual(word1, word2))
            System.out.println(true);
        else
            System.out.println(false);
    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for (String s1 : word1)
            builder1.append(s1);

        for (String s2 : word2)
            builder2.append(s2);

        return builder1.toString().equals(builder2.toString());
    }
}
