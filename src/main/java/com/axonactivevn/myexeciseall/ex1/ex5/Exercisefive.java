package com.axonactivevn.myexeciseall.ex1.ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercisefive {
    public static void main(String[] args) {
        try{
            File myFile = new File("simple.txt");
            Scanner myReader = new Scanner(myFile);
            double sum = 0;
            while (myReader.hasNextLine()){
                Double number = myReader.nextDouble();
                System.out.println(number);
                sum = sum + number;
            }
            System.out.println("sum = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }
}
