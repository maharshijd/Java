package CA2_practice;

class grandparentA{
    void showGrandParentA(){
        System.out.println("This is GrandParent Class");
    }
}
class parentA extends grandparentA{
    void showParentA(){
        System.out.println("This is Parent Class");
    }
}
class childA extends parentA{
    void showChildA(){
        
        System.out.println("This is child class");
    }
}
public class multilvl_inherit {
    public static void main(){
        childA obj = new childA();
        obj.showGrandParentA();
        obj.showParentA();
        obj.showChildA();
    }
}
