public class passingValue {
    public static void main(String[] args) {

//IN JAVA THERE IS ONLY PASS BY VALUE
    int a = 10;
    int b = 20;
    swap(a,b);
    System.out.println("a and b "+ a + " , " + b);
}

static void swap (int num1, int num2){
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("num1 and num2 "+ num1 + " , " + num2);
    }
}
/*
When you pass a primitive type (like int, double, char, etc.) to a method, a copy of the value is passed.
Changes to the parameter inside the method do not affect the original variable.
Key Takeaways:
Primitive types: A copy of the value is passed. Changes inside the method do not affect the original variable.
Objects: A copy of the reference is passed. Changes to the object through the reference are visible to the original.
Reassigning the reference inside the method: The reassignment is local to the method and does not affect the original reference.
 */


