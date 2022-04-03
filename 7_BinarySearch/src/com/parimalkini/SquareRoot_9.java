package com.parimalkini;

public class SquareRoot_9 {
    public static void main(String[] args) {
//        int x = 2147395600;
        int x = 81;
        System.out.println(findSqRt(x));
    }
    static int findSqRt(int x){
        // Base cases
        if (x == 0 || x == 1)
            return x;

        int start = 1, end = x;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid == x/mid)
                return mid;
            else if(mid < x)
                start = mid;
            else
                end = mid;
        }

        if(start <= x/start)
            return start;

        return end;
    }
}

//         Starting from 1, try all numbers until
//         i*i is greater than or equal to x.
//        int i = 1, result = 1;
//        while (result <= x) {
//            i++;
//            result = i * i;
//        }
//        return i-1;

