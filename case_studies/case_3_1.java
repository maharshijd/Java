/*
    Case Study 1 : The Telemedicine Billing Engine
The Scenario
A healthcare app offers different consultation plans. To maintain security and flexibility, the system must follow these rules:
Encapsulation: Every Plan has a private patientName and baseFee. Access is controlled via getters, and the baseFee can only be set via the constructor to prevent unauthorized tampering.
Abstraction: A generic Plan cannot exist on its own. It is an abstract class with an abstract method calculateBill().
Polymorphism: * SilverPlan: Adds a flat $15 service tax.
GoldPlan: Adds a 10% premium surcharge to the base fee but offers a $20 "Wellness Discount."
The Coding Challenge
Requirements:
Implement the Plan abstract class with encapsulated fields.
Create SilverPlan and GoldPlan subclasses.
Use a single method printInvoice(Plan p) to demonstrate polymorphism.
*/

package case_studies;

abstract class Plan {
    private String patientName;
    private double baseFee;

    public Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public abstract double calculateBill();
}

class SilverPlan extends Plan {

    public SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    @Override
    public double calculateBill() {
        return getBaseFee() + 15;
    }
}

class GoldPlan extends Plan {

    public GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    @Override
    public double calculateBill() {
        double surcharge = getBaseFee() * 0.10;
        double discount = 20;
        return getBaseFee() + surcharge - discount;
    }
}

public class case_3_1 {

    public static void printInvoice(Plan p) {
        System.out.println("Patient: " + p.getPatientName());
        System.out.println("Final Bill: $" + p.calculateBill());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Plan p1 = new SilverPlan("John", 100.0);
        Plan p2 = new GoldPlan("Sophia", 200.0);
        Plan p3 = new GoldPlan("Max", 50.0);

        printInvoice(p1);
        printInvoice(p2);
        printInvoice(p3);
    }
}