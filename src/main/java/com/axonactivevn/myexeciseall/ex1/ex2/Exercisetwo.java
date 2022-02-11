package com.axonactivevn.myexeciseall.ex1.ex2;

import java.util.Scanner;

public class Exercisetwo {

    public static void main(String[] args) {
        Double timeWorkAgency;
        Integer salaryEveryYears;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        salaryEveryYears= scanner.nextInt();
        System.out.println("Enter your time Work: ");
        timeWorkAgency = scanner.nextDouble();

        if(salaryEveryYears >=3000 && timeWorkAgency >2) {
            System.out.println("You are qualified");
        }else {
            System.out.println("You are not qualufied");
        }
    }

}
