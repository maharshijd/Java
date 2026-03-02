/*
The Scenario:
LogistiTech is a fast-growing e-commerce fulfillment center. They are struggling to track their inventory efficiently.
Some items are "Perishable"(they have an expiry date), while others are "Standard". 
The warehouse needs a system that can automatically flag expired goods and organise items by their unique SKU(Stock Keeping Unit).
The Technical Requirements:
Your task is to build a Java application that implements the following:
Inheritance & Abstraction:
create an abstract class item with properties like itemID, name, and basePrice.
create two subclasses:
PerishableItem (with an expirydate) and ElectronicsItem (with a warranty period).

Interface Implementation:
create an Interface Taxable with a method calculateTax()
PerishableItem has a 5% tax, while ElectronicsItem has 15% tax

Data Management (Collections):
Use a HashMap<String, Item> to store items where the key is the itemID.
Use a PriorityQueue or ArrayList to sort items based on their price.

The Coding Challenge
Problem Statement :
Write a Java program that allows a manager to:
Add different types of items to the inventory.
Display all items currently in the warehouse.
Search for an item using its ID.
Calculate the total value of the inventory (including tax).

Sample Input/Output Structure

Input: Add Perishable, ID: P001, Name: Milk, Price: 2.50, Expiry: 2026-03-10
Input: Add Electronic, ID: E501, Name: Headphones, Price: 120.00, Warranty: 24 months
Output (Total Value): Total Inventory Value (Incl. Tax): $140.63


*/
package day10;

import java.util.*;

interface Taxable {
    double calculateTax();
}

abstract class Item implements Taxable {
    protected String itemID;
    protected String name;
    protected double basePrice;

    public Item(String itemID, String name, double basePrice) {
        this.itemID = itemID;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getItemID() {
        return itemID;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPriceWithTax() {
        return basePrice + calculateTax();
    }

    public abstract void display();
}

class PerishableItem extends Item {
    private String expiryDate;

    public PerishableItem(String itemID, String name, double basePrice, String expiryDate) {
        super(itemID, name, basePrice);
        this.expiryDate = expiryDate;
    }

    public double calculateTax() {
        return basePrice * 0.05;
    }

    public void display() {
        System.out.println("Perishable Item | ID: " + itemID +
                " | Name: " + name +
                " | Price: $" + basePrice +
                " | Expiry: " + expiryDate +
                " | Price (Incl Tax): $" + String.format("%.2f", getPriceWithTax()));
    }
}

class ElectronicItem extends Item {
    private int warrantyPeriod;

    public ElectronicItem(String itemID, String name, double basePrice, int warrantyPeriod) {
        super(itemID, name, basePrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public double calculateTax() {
        return basePrice * 0.15;
    }

    public void display() {
        System.out.println("Electronic Item | ID: " + itemID +
                " | Name: " + name +
                " | Price: $" + basePrice +
                " | Warranty: " + warrantyPeriod + " months" +
                " | Price (Incl Tax): $" + String.format("%.2f", getPriceWithTax()));
    }
}

public class q1 {

    static HashMap<String, Item> inventory = new HashMap<>();

    public static void addItem(Item item) {
        inventory.put(item.getItemID(), item);
        System.out.println("Item added successfully!");
    }

    public static void displayAllItems() {
        if (inventory.isEmpty()) {
            System.out.println("Warehouse is empty.");
            return;
        }

        ArrayList<Item> list = new ArrayList<>(inventory.values());

        // Sort by price
        Collections.sort(list, new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                return Double.compare(i1.getBasePrice(), i2.getBasePrice());
            }
        });

        for (Item item : list) {
            item.display();
        }
    }

    public static void searchItem(String id) {
        Item item = inventory.get(id);
        if (item != null) {
            item.display();
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void calculateTotalValue() {
        double total = 0;
        for (Item item : inventory.values()) {
            total += item.getPriceWithTax();
        }
        System.out.println("Total Inventory Value (Incl. Tax): $" + String.format("%.2f", total));
    }

    public static void main(String[] args) {

        addItem(new PerishableItem("P001", "Milk", 2.50, "2026-03-10"));
        addItem(new ElectronicItem("E501", "Headphones", 120.00, 24));

        System.out.println("\n--- All Items ---");
        displayAllItems();

        System.out.println("\n--- Search Item (P001) ---");
        searchItem("P001");

        System.out.println("\n--- Total Value ---");
        calculateTotalValue();
    }
}
