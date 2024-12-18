import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sumOfTwonos {
    public static void main(String[] args) {
        //Q: Take input of two nos
        sum();
        int ans = sum2();
        System.out.println("The answer is " + ans);
        int ans3 = sum3(20,30);
        System.out.println("the answer3 is "+ ans3);
    }
  static  void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1");
        int num1 = in.nextInt();
        System.out.println("Enter no 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is " + sum);
    }
//return the value
   static  int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no 1");
        int num1 = in.nextInt();
        System.out.println("Enter no 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is " + sum);
        return sum;
    }

    //return type arguments
    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b)
    {
        int sum3 = a+b;
        return sum3;
    }
    }
