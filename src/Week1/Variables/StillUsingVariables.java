package Week1.Variables;

public class StillUsingVariables {
    public static void main(String[] args) {
        System.out.println(nameYear("Juan Valdez", "2010"));
    }

    public static String nameYear(String n, String y){
        String name = n;
        String year = y;
        String result = ("My name is " + name  + " and I'll graduate in " + year + ".");
        return result;
    }
}
