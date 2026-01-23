package day3;

import java.util.Scanner;

class Calculator {
    int a, b;
    char choice;

    // Parameterized constructor
    Calculator(int x, int y, char ch) {
        a = x;
        b = y;
        choice = ch;
    }

    void calculate() {
        switch (choice) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Division by zero not allowed");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

public class day3_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        Calculator obj = new Calculator(n1, n2, op);
        obj.calculate();
    }
}

