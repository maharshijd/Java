package day6;

class FinalVarExample{
    final int var = 100;
    void display(){
        System.out.println("Final Var Val: "+var);
    }
}

public class final_var {
    public static void main(String[] args) {
        FinalVarExample obj = new FinalVarExample();
        obj.display();
    }
}
