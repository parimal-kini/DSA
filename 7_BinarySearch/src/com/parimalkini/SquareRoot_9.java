package com.parimalkini;

public class SquareRoot_9 {
    public static void main(String[] args) {
        int x = 2147395600;
//        int x = 81;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int ans = -1;

        while (start <= end) {
            //using long instead of int because in one test case int limit exceeds
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == x)
                //casting long to int to avoid type mismatch
                return (int) mid;
            else if (square < x) {
                ans = (int) mid;
                start = (int) (mid + 1);
            } else
                end = (int) (mid - 1);
        }
        return ans;
    }
}
//    static int findSqRt(int x){
//        // Base cases
//        if (x == 0 || x == 1)
//            return x;
//
//        int start = 1, end = x;
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//            if(mid == x/mid)
//                return mid;
//            else if(mid < x)
//                start = mid;
//            else
//                end = mid;
//        }
//
//        if(start <= x/start)
//            return start;
//
//        return end;
//    }
//}

//         Starting from 1, try all numbers until
//         i*i is greater than or equal to x.
//        int i = 1, result = 1;
//        while (result <= x) {
//            i++;
//            result = i * i;
//        }
//        return i-1;

