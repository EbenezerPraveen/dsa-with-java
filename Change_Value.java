import java.util.Arrays;

public class Change_Value{
    public static void main(String[] args) {
        // create an array;
        int[] arr = {1,2,3,4,5,6};

        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] nums){
        nums[0]=99;
    }
}