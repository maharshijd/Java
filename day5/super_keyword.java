package day5;

class parent{
    void display(){
        System.out.println("This is Parent class");
    }
}

class child extends parent{
    void display(){
        super.display();
        System.out.println("This is Child class");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
