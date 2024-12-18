public class Scope {
    public static void main(String[] args) {

       //Anything that is initialized outside the block can be used inside the block
        //Anything that is initialized inside the block cannot be used outside the block but can be initialized outside.
        int a = 10;
        int b = 20;
        String name = "Seetha";

        {
            //int a = 28; already initialised outside the block in the same method, hence
            //you cannot initialise again
            a = 100;//we can change the value i.e reassign the original reference variable to some other value
            int c = 99;
            //values initialised in this block, will remain in block
            name = "Ram";
        }
        System.out.println(a);
        System.out.println(name);
       // System.out.println(c);//cannot use outside the block

        //Scoping in loops
        for (int i=0;i<4;i++){
            System.out.println(i);
            int num = 90;
             a = 10;
        }


    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
