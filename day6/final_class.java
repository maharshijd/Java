//A final class cannot be extended by any subclass
package day6;

class FinalClass{
    void display(){
        System.out.println("This is Final Class");
    }
}

// class subclass extends finalclass{} --> Compilation error
public class final_class {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
