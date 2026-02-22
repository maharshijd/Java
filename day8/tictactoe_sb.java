package day8;
import java.util.Scanner;
public class tictactoe_sb {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("123456789");
        int count=1,choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(sb.substring(0,3)+"\n"+sb.substring(3,6)+"\n"+sb.substring(6,9));
        while(count<=9){
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            sb.setCharAt(choice-1, count%2==0 ? 'O' : 'X');
            System.out.println(sb.substring(0,3)+"\n"+sb.substring(3,6)+"\n"+sb.substring(6,9));
            count++;
        }
    }
    
}
