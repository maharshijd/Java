package day7;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> roll= new Vector<>();
        roll.add(100);
        roll.add(200);
        roll.add(300);

        System.out.println("Roll. No.: "+roll);
        roll.remove(2);
        System.out.println("Roll. No.: "+roll);
        roll.add(300);
        System.out.println("Roll. No.: "+roll);
    }    
}
