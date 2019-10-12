package Week1.IfStatements;
import java.util.Scanner;

public class HowOldAreYouSpecifically {

    public static void main(String[] args) {
        askAge();
    }

    public static void askAge(){
        Scanner user_input = new Scanner(System.in);
        String userName;
        int userAge;

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        userName = user_input.next();
        System.out.print("Ok, " + userName + ", how old are you?");
        userAge = user_input.nextInt();

        if(userAge >= 25){
            System.out.println("You can do pretty much anything, " + userName + ".");
        }else if(userAge >= 18 && userAge <= 24){
            System.out.println("You can vote but not rent a car, " + userName + ".");
        }else if(userAge >= 16 && userAge <= 17){
            System.out.println("You can drive but you can't vote, " + userName + ".");
        }else if(userAge < 16){
            System.out.println("You can't drive, " + userName + ".");
        }
    }
}
