package Week1.ForLoops;
import java.util.Scanner;

public class CountingMachine {

    public static void main(String[] args) {
        countNum();
    }

    public static void countNum(){
        Scanner user_input = new Scanner(System.in);
        int number;
        System.out.print("Count to: ");
        number = user_input.nextInt();

        for(int i =0; i <= number; i++){
            System.out.print(i + " ");
        }
    }
}
