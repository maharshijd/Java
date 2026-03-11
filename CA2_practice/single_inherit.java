package CA2_practice;

class parentX{
    void showParent(){
        System.out.println("This is Parent Class");
    }
}
class childX extends parentX{
    void showChild(){
        showParent();
        System.out.println("This is Child Class");
    }
}

public class single_inherit {
    public static void main(){
        childX obj = new childX();
        obj.showParent();
        obj.showChild();
    }
}
