package day3;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    static String college = "ABC Engineering College";

    
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: 24070122" + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class day3_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        Student s = new Student(r, n);
        s.display();
    }
}

