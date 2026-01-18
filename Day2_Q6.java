class Reverse{
    void undefined(String s){
        String rev = "";
        for(int i= s.length()-1; i>=0;i--){
            rev = rev+ s.charAt(i);
        }
        System.out.println("Reverse: "+rev);
    }
    void predefined(String s){
        StringBuffer rev = new StringBuffer(s);
        rev.reverse();
        System.out.println("Reverse: "+rev);
    }
}
public class Day2_Q6 {
    public static void main(){
        Reverse obj = new Reverse();
        String s = "Maharshi";
        obj.undefined(s);
        obj.predefined(s); 
    }
}
