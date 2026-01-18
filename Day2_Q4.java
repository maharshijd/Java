//Create a program where child class will be inheriting properties of parent class.


class Animal{
    void legs(){
        System.out.println("Has 4 Legs");
    }
}
class Dog extends Animal{
    void voice(){
        System.out.println("Barks");
        legs();
    }
}
public class Day2_Q4 {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.voice();
    }
}
