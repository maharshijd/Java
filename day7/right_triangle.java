package day7;
import java.util.Scanner;
public class right_triangle {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=0;j--) System.out.print(" ");
            for(int j=n-i;j>=0;j--) System.out.print(" ");
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
