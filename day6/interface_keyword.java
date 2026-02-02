//to solve the diamond problem of multiple inheritance
package day6;

interface animal1{
    void sound();
}

class dog1 implements animal1{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
public class interface_keyword {
    public static void main(String[] args) {
        animal1 a = new dog1();
        a.sound();
    }
}
