package day7;

import java.util.ArrayList;


public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Fruits: "+fruits);

        fruits.remove("Banana");
        System.out.println("Fruits: "+fruits);

        fruits.add("Kiwi");
        System.out.println("Fruits: "+fruits);
        System.out.println("No. of. Fruits: "+fruits.size());
    }
    
}
