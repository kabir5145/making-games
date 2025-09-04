package com.company;

import java.util.Scanner;

public class projects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI calculator for men and women !");
        System.out.println("Enter your name : ");
        String s = sc.nextLine();
        System.out.println("What is your gender(M or F)");
        String g = sc.nextLine();
        System.out.println("Enter your weight(in kg) : ");
        double w = sc.nextDouble();
        System.out.println("Enter your height(in cm):");
        double h = sc.nextDouble();

        double bmi =w/(h*h)*10000;

        System.out.println(s+" your BMI is : "+bmi);

        if(bmi<=18.5){
            System.out.println("Underweight");
        } else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("Normal Weight");
        } else if (bmi>=25 && bmi<=29.9) {
            System.out.println("Overweight");
        } else if (bmi>=30 && bmi<=39.9) {
            System.out.println("Obese");
        }else {
            System.out.println("Extremely Obese");
        }
        sc.close();
    }
}
