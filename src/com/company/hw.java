package com.company;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        int input = sc.nextInt();

        while (input >= 10) {
            int con = input / 10;
            input = input % 10;
            input = con + input;
        }

        System.out.println(input);

    }
}
