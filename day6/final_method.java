//A final method cannot be overridden by a subclass.

package day6;

class parent{
    final void display(){
        System.out.println("Final Method Called !!!");
    }
}

class child extends parent{

}

public class final_method {
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
    }
}
