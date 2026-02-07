package day7;

class parent{
    void show()
    {
        System.out.println("This is Parent class");
    }
}
class child extends parent{
    @Override
    void show(){
        System.out.println("This is child class");
    }
}

public class override {
    public static void main(String[] args) {
        parent obj = new child();
        obj.show();
    }
}
