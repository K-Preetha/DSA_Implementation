import java.util.Arrays;

public class VariableArgumenta {
    /*
    It is basically when you create a method that takes a variable number of arguments.
    It is basically when we dont know how many arguments we are passing.
     */
    public static void main(String[] args) {
        fun(2,3,4,5,6,67,87,98,54,65,32,54);
        multiplearg(1,2,"preetha,karnan,ananthi,iyappan");
    }
    static void fun(int ...v){ // it internally taking array of integers
        System.out.println(Arrays.toString(v));
    }
    static void multiplearg(int a,int b,String ...v){
        System.out.println("a is " + a + "b is " + b + " string is " + Arrays.toString(v) );
    }
}
