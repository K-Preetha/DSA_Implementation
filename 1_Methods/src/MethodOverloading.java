import java.util.Arrays;

public class MethodOverloading {
    /*
    Method overloading happens if two or more functions of the same name exists if the parameters differs.
    i.e same function name but different arguments.
    This will decide at compile time which function to run.
     */
    public static void main(String[] args) {
        fun(67);
        fun("preetha karnan");
        int ans = sum(3,4);
        System.out.println(ans);
        int ans1 = sum(4,5,6);
        System.out.println(ans1);
        demo(1,2,3,4,5);
        demo("preetha","karnan","rini","sharon");
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
    static int sum (int a,int b){
        return a+b;
    }

    static int sum (int a,int b,int c){
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
