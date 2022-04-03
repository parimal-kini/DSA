package com.parimalkini;

public class ValidPerfectSquare_13 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPerfectSquare(num));
    }
    static int isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid > num)
                end = mid - 1;
            else if(mid * mid < num)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}

//class Solution {
//    public boolean isPerfectSquare(int num) {
//        int l = 1;
//        int r = num;
//        while(l <= r) {
//            int m = l + (r - l) / 2;
//            if (Integer.MAX_VALUE / m < m) {
//                r = m - 1;
//                continue;
//            }
//            int sq = m * m;
//
//            if (num == sq) return true;
//            if (num < sq) r = m - 1;
//            else l = m + 1;
//        }
//        return false;
//    }
//}
