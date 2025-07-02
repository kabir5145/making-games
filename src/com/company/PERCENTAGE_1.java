package com.company;
import java.util.Scanner;

public class PERCENTAGE_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("marks in maths");
        float a = s.nextFloat();
        System.out.println("marks in physics");
        float b=s.nextFloat();
        System.out.println("marks in chemistry");
        float c=s.nextFloat();
        float sum = a+b+c;
        float percentage=(sum/300f)*100;
        System.out.println("your percentage = " +percentage);


    }
}
