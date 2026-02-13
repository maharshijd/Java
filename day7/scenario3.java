package day7;

/*
Scenario:
You are tasked with developing a simple Online Shopping Cart System in Java. The system should allow users to add products to a shopping cart, remove products, calculate the total cost of the cart, and display all products in the cart.
Requirements:
Create a Product class with the following attributes:
name (String)
price (double)
Create a ShoppingCart class that manages a collection of products. The ShoppingCart class should have the following methods:
addProduct(Product product): Adds a product to the cart.
removeProduct(String productName): Removes a product from the cart by its name.
calculateTotalCost(): Calculates and returns the total cost of all products in the cart.
displayCart(): Displays all products in the cart along with their prices and the total cost.
Create a Main class to test the functionality of the ShoppingCart class.

Question:
Write the Java code to implement the above scenario. Your code should include the Product class, the ShoppingCart class, and the Main class. Ensure that the Main class demonstrates adding products, removing products, calculating the total cost, and displaying the cart.

*/

import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    ArrayList<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(productName)) {
                products.remove(i);
                return;
            }
        }
        System.out.println("Product not found");
    }

    double calculateTotalCost() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    void displayCart() {
        if (products.size() == 0) {
            System.out.println("Cart is empty");
            return;
        }

        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }

        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class scenario3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        cart.removeProduct("Mouse");

        cart.displayCart();
    }
}
