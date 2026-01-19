package day3;
class Student {
    String name;
    int age;

    Student() {
        name = "Default";
        age = 18;
    }
    Student(String n,int a){
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        Student obj2 = new Student("Maharshi",19);
        obj2.display();
    }
}
