package day5;

class Parent {
    int num = 10;

    Parent() {
        System.out.println("Parent class constructor");
    }

    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    int num = 20;

    Child() {
        super();
        System.out.println("Child class constructor");
    }

    void display() {
        System.out.println("Child num (this.num): " + this.num);
        System.out.println("Parent num (super.num): " + super.num);

        this.show();
        super.show();
    }
    void show() {
        System.out.println("This is Child class method");
    }

}

public class day5_q1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
