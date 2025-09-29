package com.company;

import java.util.Scanner;

public class currency_convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String s = sc.nextLine();

        System.out.println("Enter the number of money you want to convert : ");
        double amt = sc.nextInt();

        System.out.println("The converted value of the currency from us dollar to Indian currency is :");
        double convert = amt*88.69;
        System.out.println(convert);

        sc.close();
    }
}
