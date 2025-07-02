package com.company;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class practice_set_ch4 {
    public static void main(String[] args) {

            //q2
//        byte m1 , m2 , m3 ;
//            Scanner s = new Scanner(System.in);
//        System.out.println("enter your marks in physics");
//        m1 = s.nextByte();
//        System.out.println("enter your marks in maths");
//        m2 = s.nextByte();
//        System.out.println("enter your marks in chemistry");
//        m3 = s.nextByte();
//        float avg = (m1 + m2 + m3)/3.0f;
//        System.out.println("your overall percentage is :" +avg);
//        if(avg>=40 && m1>33 && m2>=33 && m3>=33) {
//            System.out.println("congratulations you have been promoted!");
//        }
//        else{
//            System.out.println("sorry you have been not promoted ! please try again");

        //q4

//        Scanner s = new Scanner(System.in);
//        int day = s.nextInt();
//
//        switch(day){
//            case 1 :System.out.println("monday");
//            case 2 :System.out.println("tuesday");
//            case 3 :System.out.println("wed");
//            case 4 :System.out.println("thurs");
//            case 5 :System.out.println("fri");
//            case 6 :System.out.println("sat");
//            case 7 :System.out.println("sunday");

        //q6

        Scanner s = new Scanner(System.in);
        String website =s.next();
        if (website.endsWith(".com")) {
            System.out.println("it is a commercial website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("it is an organisational website");
        } else if (website.endsWith(".in")) {
            System.out.println("this is an indian website");

        }

        }
          }
        



