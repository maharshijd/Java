package day8;
import java.util.ArrayList;
import java.util.Scanner;
class game{
    ArrayList<String> board = new ArrayList<>();

    game(){
        for(int i=1;i<=9;i++){
            board.add(String.valueOf(i));
        }
    }
    void status(){
        System.out.println(board.subList(0, 3));
        System.out.println(board.subList(3, 6));
        System.out.println(board.subList(6, 9));
    }
    void update(int choice,int counter){
        if(counter%2==0){
            board.set(choice-1,"X");
        }
        else{
            board.set(choice-1,"O");
        }
    }

}

public class tictactoe {
    public static void main(String[] args) {
        game trial = new game();
        int counter=0;
        Scanner sc = new Scanner(System.in);
        int choice;        
        while(counter<=8){
            trial.status();
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            trial.update(choice,counter);
            counter++;
        }

    }
}
