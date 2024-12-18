import java.util.Scanner;

public class stringExample {
public static void main(String[] args){
    String message = greet();
    System.out.println(message);
    String personalised = myGreet("RJANU");
    System.out.println(personalised);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the name");
    String name = scanner.next();
    String pers1 = myGreet(name);
    System.out.println("the pers2 name is " + pers1);
}

     static String myGreet(String name) {
   String message = "Hello " + name;
   return message;
    }

    static String greet(){
    String greeting="How are you?";
    return greeting;
    }
}
