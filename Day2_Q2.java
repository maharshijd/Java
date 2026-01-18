package day2;
//WAP in java to divide 2 numbers where you should be checking the condition of /0 error
public class Day2_Q2 {
    public static void main(String[] args){
        int a =21,b=21;
        div(a,b);
    }
    public static void div(int a, int b){
        if(a != 0) System.out.println("Division:"+(b/a));
        else System.out.println("Invalid Input");
    }
}
