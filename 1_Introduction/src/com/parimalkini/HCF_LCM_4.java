package com.parimalkini;
import java.util.Scanner;

//HCF/GCD = highest common factor/greatest common divisor
// 4 = 2*2
// 6 = 2*3
// HCF/GCD = 2


//LCM = least common multiple
// 4 = 4,8,12,16,...        24 = 24,48...
// 6 = 6,12,18,...          48 = 48...
// LCM = 12;                LCM = 48


public class HCF_LCM_4 {
    public static void main(String args[]){
        int temp1, temp2, num1, num2, temp, hcf, lcm;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scanner.nextInt();
        scanner.close();

        temp1 = num1;
        temp2 = num2;

        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);
    }
}
