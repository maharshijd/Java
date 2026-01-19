package day3;

public class Instance_var {
    String name;
    int id;
    public static void main(){
        Instance_var o1 = new Instance_var();
        o1.name = "Maharshi";
        
        Instance_var o2 = new Instance_var();
        o2.name = "Student";
        System.out.println(o1.name+" "+o2.name);
    }
}
