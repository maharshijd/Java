package CA2_practice;
import java.util.Scanner;
// public class loops {
//     public static void main(String Args[]){
//         System.out.println("Enter a number:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int sum=0;
//         while(temp!=0){
//             sum=sum+temp%10;
//             temp/=10;
//         }
//         System.out.println("Sum of All Digits: "+sum);
//     }    
// }

public class loops{
    public static void main(String args[]){
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,rev=0;
        while(temp!=0){
            rev=(rev*10)+temp%10;
            temp/=10;
        }
        System.out.println("Reversed: "+rev);
    }
}