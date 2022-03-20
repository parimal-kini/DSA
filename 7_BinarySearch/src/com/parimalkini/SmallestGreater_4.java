package com.parimalkini;

public class SmallestGreater_4 {
    public static void main(String[] args) {
        char[] letters = {'a','c','f','i','l'};
        char target = 'j';
        System.out.println(greatestLetter(letters, target));
    }
    static char greatestLetter(char[] letters, char target){
        int start = 0, end = letters.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}
