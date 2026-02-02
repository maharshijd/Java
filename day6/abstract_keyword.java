package day6;

abstract class shape{
    abstract void draw();
    void message()
    {
        System.out.println("This is a shape");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Draw a circle");
    }
} 
public class abstract_keyword {
    public static void main(String[] args) {
        shape obj = new circle();
        obj.draw();
        obj.message();
    }    
}
