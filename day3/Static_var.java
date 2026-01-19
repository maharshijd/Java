package day3;

class Count{
    static int count = 0;
    void Increment(){
        count++;
        System.out.println("Counter: "+count);
    }

}
public class Static_var {
    public static void main(String[] args){
        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();
        obj1.Increment();
        obj2.Increment();
        obj3.Increment();
    }

}
