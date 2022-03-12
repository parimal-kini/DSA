package com.parimalkini;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ArmstrongBetweenTwo_14 {
    public static void main(String args[]){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = sc.nextInt();
        System.out.println("Enter the second number ::");
        num2 = sc.nextInt();

        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }
    }

//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number : ");
//        int start = sc.nextInt();
//        System.out.println("Enter 2nd number : ");
//        int end = sc.nextInt();
//        armstrong(start, end);
//    }
//    static void armstrong(int start, int end){
//        for (int i = start; i<end; i++){
//            int temp=start, sum=0, rem;
//            while (start != 0){
//                rem = start % 10;
//                sum += (rem*rem*rem);
//                start = start/10;
//                }
//                if(temp == sum)
//                System.out.println(temp+" is a armstrong number");
//                else
//                System.out.println(temp+" is not a armstrong number");
//        }
//    }
}
//    int temp=num, sum=0, rem;
//        while (num != 0){
//                rem = num % 10;
//                sum += (rem*rem*rem);
//                num = num/10;
//                }
//                if(temp == sum)
//                System.out.println(temp+" is a armstrong number");
//                else
//                System.out.println(temp+" is not a armstrong number");