package com.parimalkini;

import java.util.Scanner;

public class StudentGrade_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int numOfSub = scanner.nextInt();
        System.out.println("Enter the marks for each subject : ");
        int totalMarks=0;
        for(int i=0; i<numOfSub; i++){
             totalMarks += scanner.nextInt();
        }

        displayGrade(numOfSub, totalMarks);
    }
    static void displayGrade(int numOfSubs, int totalMarks){
        int avg = (totalMarks / (numOfSubs*10)) * 10;
        System.out.println(avg);
        if(avg<100 && avg>90)
            System.out.println("AA");
        else if(avg<91 && avg>80)
            System.out.println("AB");
        else if(avg<81 && avg>70)
            System.out.println("BB");
        else if(avg<71 && avg>60)
            System.out.println("BC");
        else if(avg<61 && avg>50)
            System.out.println("CD");
        else if(avg<51 && avg>40)
            System.out.println("DD");
        else if(avg<41)
            System.out.println("Fail");
    }
}
