package Week1.KeyboardInput;
import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        nameAgeSalary();
    }

    public static void nameAgeSalary(){
        Scanner user_input = new Scanner(System.in);
        String userName;
        String userAge;
        double userSalary;

        System.out.println("Hello.  What is your name?");
        userName = user_input.next();
        System.out.println("Hi, " + userName + "!  How old are you?");
        userAge = user_input.next();
        System.out.println("So you're " + userAge + ", eh?  That's not old at all!\nHow much do you make, " + userName + "?");
        userSalary = user_input.nextDouble();
        System.out.println(userSalary + "!  I hope that's per hour and not per year! LOL!");
    }
}
