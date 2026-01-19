//WAP in java using parameterized constructor to print name, roll no., prn of user using scanner

package day3;
import java.util.Scanner;

class Student{
    String name;
    int roll;
    Student(String n, int r){
        name = n;
        roll = r;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
    }
}
public class day3_q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        Student s1 = new Student(name,roll);
        s1.show();
    }
}
