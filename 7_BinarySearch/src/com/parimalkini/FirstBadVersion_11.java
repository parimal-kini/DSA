package com.parimalkini;

public class FirstBadVersion_11 {
    public static void main(String[] args) {
        int n = 10;
        int bad = 8;
        System.out.println(firstBadVersion(n, bad));
    }
    static int firstBadVersion(int n, int bad) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            boolean isBad = isBadVersion(mid, bad);
            if(isBad)
                return mid;
            else {
                if(mid < bad)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
    static boolean isBadVersion(int version, int bad){
        if(version == bad)
            return true;
        return false;
    }
}
