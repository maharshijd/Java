package day3;

public class Instance_methods {
    String name;
    void display(){
        System.out.println("Name: "+name);
    }
    public static void main(){
        Instance_methods p = new Instance_methods();
        p.name = "John";
        p.display();
    }
}
