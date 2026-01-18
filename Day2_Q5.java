class Sum{
    void add(int a,int b){
        System.out.println("Integer Addition: "+(a+b));
    }
    void add(float a, float b){
        System.out.println("Float Addition:"+(a+b));
    }
}
public class Day2_Q5 {
    public static void main(String args[]){
        Sum obj = new Sum();
        obj.add(1, 2);
        obj.add(1.2f,2.3f);
    }
}
