package day9;
public class chained_exception_2 {

    public static void main(String[] args) {

        String s = "";

        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        

        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        s = null;
        
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //s = "GeeksforGeeks";   
    }
    public static int getLength(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        }
        return s.length();
    }
}