package Week1.KeyboardInput;
import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) { calcAge();
    }
    public static void calcAge(){
        Scanner user_input = new Scanner(System.in);
        String userName;
        int userAge;

        System.out.print("Hello.  What is your name?");
        userName = user_input.next();
        System.out.print("Hi, " + userName + "!  How old are you? ");
        userAge = user_input.nextInt();
        System.out.println("Did you know that in five years you will be " + (userAge + 5) + " years old?");
        System.out.println("And five years ago you were " + (userAge - 5) + "! Imagine that!");

    }
}
