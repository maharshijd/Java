package day5;

class Parent1 {
    int value = 100;

    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child1 extends Parent1 {
    int value = 200;

    void display() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);

        super.show();
    }
}

public class day5_q2 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.display();
    }
}
