import java.util.Arrays;

public class changeValue {

    public static void main(String[] args) {
        int[] arr = {99,98,93,04,97};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void change(int[] nums){
        nums[0]=1;
    }

}

/*
For objects and references for complex data types pass by vale of that reference variable
i.e both the reference variable pointing to the same object if you make the change via one
reference variable original one will be changed.
 */
