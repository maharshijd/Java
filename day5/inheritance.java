package day5;

class Animal{
    void eat(){
        System.out.println("This Animal easts food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
