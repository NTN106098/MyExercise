package com.axonactivevn.myexeciseall.ex1;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String args[])
    {
        int marks[] = new int[3];
        int i,n;
        boolean flag = true;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Point: ");
        n = scanner.nextInt();
        for(i=0; i<n; i++) {
            System.out.print("Enter your Point  "+(i+1)+": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        avg = total/n;
        System.out.println("Medium score:"+ " " + avg);
        System.out.print("Your rank are: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.print("B");
        }
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");        }
        else if (avg>=60 && avg<70)
        {
            System.out.println("D");}
        else
        {
            System.out.print("F");
        }
        System.out.println();

    }
}
