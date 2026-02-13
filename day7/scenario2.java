package day7;

/*
Scenario:
You are tasked with developing a simple Student Grade Management System in Java. The system should allow users to add students, add grades for each student, calculate the average grade for a student, and display all students along with their grades and average.
Requirements:
Create a Student class with the following attributes:
name (String)
grades (List of Double)
The Student class should have the following methods:
addGrade(double grade): Adds a grade to the student's list of grades.
calculateAverage(): Calculates and returns the average grade of the student.
displayStudentDetails(): Displays the student's name, grades, and average.
Create a GradeManager class that manages a collection of students. The GradeManager class should have the following methods:
addStudent(Student student): Adds a student to the system.
findStudentByName(String name): Finds and returns a student by their name.
displayAllStudents(): Displays all students along with their grades and average.
Create a Main class to test the functionality of the GradeManager class.

Question:
Write the Java code to implement the above scenario. Your code should include the Student class, the GradeManager class, and the Main class. Ensure that the Main class demonstrates adding students, adding grades, calculating averages, and displaying all students.

*/

import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Double> grades;

    Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    void addGrade(double grade) {
        grades.add(grade);
    }

    double calculateAverage() {
        if (grades.size() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + calculateAverage());
        System.out.println();
    }
}

class GradeManager {
    ArrayList<Student> students;

    GradeManager() {
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }

    void displayAllStudents() {
        for (Student s : students) {
            s.displayStudentDetails();
        }
    }
}

public class scenario2 {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        manager.addStudent(s1);
        manager.addStudent(s2);

        s1.addGrade(85.5);
        s1.addGrade(90.0);
        s1.addGrade(78.0);

        s2.addGrade(88.0);
        s2.addGrade(92.5);

        Student found = manager.findStudentByName("Alice");
        if (found != null) {
            found.addGrade(95.0);
        }

        manager.displayAllStudents();
    }
}

