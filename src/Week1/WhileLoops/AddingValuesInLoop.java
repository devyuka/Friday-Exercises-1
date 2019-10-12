package Week1.WhileLoops;
import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args) {
        sumValue();
    }

    public static void sumValue(){
        Scanner user_input = new Scanner(System.in);
        int number;
        System.out.print("I will add up the numbers you give me.\nNumber: ");
        number = user_input.nextInt();
        int sum = number;

        while(number != 0){
            System.out.println("The total so far is " + sum);
            System.out.print("Number: ");
            number = user_input.nextInt();
            sum += number;
        }

        System.out.print("The total is " + sum + ".");
    }

}
