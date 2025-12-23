import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8};
            System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[1] = 100;
    }
}
