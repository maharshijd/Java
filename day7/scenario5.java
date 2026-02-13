package day7;

/*
Scenario:
You are tasked with developing an Employee Payroll Management System in Java. The system should allow users to manage employees, calculate their monthly salary based on their role, and apply bonuses or deductions. The system should use a switch-case statement to handle different employee roles and their respective salary calculations.
Requirements:
Create an Employee class with the following attributes:
employeeId (String)
name (String)
role (String) – Roles can be "Manager", "Developer", "Designer", or "Intern".
baseSalary (double)
The Employee class should have the following methods:
calculateSalary(): Calculates the monthly salary based on the employee's role using a switch-case statement.
Manager: Base salary + 20% bonus.
Developer: Base salary + 10% bonus.
Designer: Base salary + 5% bonus.
Intern: Fixed salary of $1000 (ignores base salary).
applyDeduction(double amount): Applies a deduction to the employee's salary.
displayEmployeeDetails(): Displays the employee's details, including their calculated salary.
Create a Payroll class that manages a collection of employees. The Payroll class should have the following methods:
addEmployee(Employee employee): Adds an employee to the payroll.
calculateAllSalaries(): Calculates and displays the salaries of all employees.
findEmployeeById(String employeeId): Finds and returns an employee by their ID.
Create a Main class to test the functionality of the Payroll class.


*/
import java.util.ArrayList;

class Employee {
    String employeeId;
    String name;
    String role;
    double baseSalary;
    double salary;

    Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {
        switch (role) {
            case "Manager":
                salary = baseSalary + (baseSalary * 0.20);
                break;
            case "Developer":
                salary = baseSalary + (baseSalary * 0.10);
                break;
            case "Designer":
                salary = baseSalary + (baseSalary * 0.05);
                break;
            case "Intern":
                salary = 1000;
                break;
            default:
                salary = baseSalary;
        }
    }

    void applyDeduction(double amount) {
        salary -= amount;
    }

    void displayEmployeeDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Payroll {
    ArrayList<Employee> employees;

    Payroll() {
        employees = new ArrayList<>();
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    Employee findEmployeeById(String employeeId) {
        for (Employee e : employees) {
            if (e.employeeId.equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    void calculateAllSalaries() {
        for (Employee e : employees) {
            e.calculateSalary();
            e.displayEmployeeDetails();
        }
    }
}

public class scenario5 {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        Employee e1 = new Employee("E101", "Alice", "Manager", 5000);
        Employee e2 = new Employee("E102", "Bob", "Developer", 4000);
        Employee e3 = new Employee("E103", "Charlie", "Intern", 2000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);

        payroll.calculateAllSalaries();

        Employee found = payroll.findEmployeeById("E102");
        if (found != null) {
            found.calculateSalary();
            found.applyDeduction(500);
            found.displayEmployeeDetails();
        }
    }
}
