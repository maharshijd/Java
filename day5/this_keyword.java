package day5;

class Student{
    String name;
    void details(String n){
        this.name=n;
    }
    void show(){
        System.out.println(this.name);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.details("Mah");
        obj.show();
    }
}
