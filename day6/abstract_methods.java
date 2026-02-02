package day6;

abstract class animal{
    abstract void sound();
    void eat(){
        System.out.println("This animal eats food");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("Dog Barks: ");

    }
}

public class abstract_methods {
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
        a.eat();
    }
}
