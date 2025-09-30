package com.company;

import java.util.Scanner;

class Classroom{
    String className;
    String [] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }
    public void attendance(){
        System.out.println("The class name is : "+className);
        for(String  student : students){
            System.out.print(student+" ");
        }
        System.out.println();
    }
}
public class Attendance_system {
    public static void main(String[] args) {
        String[]student = {"kabir","raghav","aaditya"};
        Classroom c = new Classroom("Earth",student);
        c.attendance();

        Scanner sc = new Scanner(System.in);
        System.out.println("Mark the attendance of the students :");
        int studentNumber = sc.nextInt();

        if (studentNumber >= 1 && studentNumber <= student.length) {
            System.out.println(student[studentNumber - 1] + " is Present");
        } else {
            System.out.println("Invalid student number");
        }

        int studentNumbers = sc.nextInt();

        if (studentNumbers >= 1 && studentNumbers <= student.length) {
            System.out.println(student[studentNumbers - 1] + " is Present");
        } else {
            System.out.println("Invalid student number");
        }

        int studentNumber_3 = sc.nextInt();

        if (studentNumber_3 >= 1 && studentNumber_3 <= student.length) {
            System.out.println(student[studentNumber_3 - 1] + " is Present");
        } else {
            System.out.println("Invalid student number");
        }
        sc.close();
    }
}
