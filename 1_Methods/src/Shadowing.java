public class Shadowing {
    /*Shadowing a variable in a child or inner scope has the same name as a variable in the parent or outer scope, effectively "hiding" or "shadowing" the outer variable. This can occur with class fields, method parameters, and local variables.
In simple words Shadowing in java is the practice of using two variables with the same name within the scope that overlaps.
     */
    static int x = 90; //This will be shadowed at line 6

    public static void main(String[] args) {
        System.out.println(x); //90
        int x; // The class variable at line 2 is shadowed by this
        //  System.out.println(x); // scope will begin when the value is initialized
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
