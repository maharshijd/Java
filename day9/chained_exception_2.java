package day9;
public class chained_exception_2 {

    static String s;
    public static void main(String[] args) {

        

        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        
        
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
            getLength(s);
        }
     
    }
    public static int getLength(String s) {
        
        if (s == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        }
        return s.length();
    }
}