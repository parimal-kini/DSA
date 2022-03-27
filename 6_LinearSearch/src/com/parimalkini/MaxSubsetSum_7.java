package com.parimalkini;

public class MaxSubsetSum_7 {
    public static void main(String[] args) {
        int[] a = {1, 2, -4, -2, 3, 9};
        findMaxSubset(a);
    }
    static void findMaxSubset(int[] a){
        int sum = 0, length = 0, flag = 0, max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {// logic for finding maximumm
            if(flag==0){
                max=a[i];
                flag=1;
            }
            if(max<a[i])
                max=a[i];

            // if a[i] is greater than 0 than add it to the sum
            if(a[i]>=0){
                sum=sum+a[i];
                length++;
            }
        }

        // if there is no any positive number then
        if(sum==0 && length==0){
//            cout<<max<<" "<<"1";
            System.out.println(max+" "+"1");
        }

        // if a[i] have positive number then
        else
//            cout<<sum<<" "<<length;
            System.out.println(sum+" "+length);
    }
}
