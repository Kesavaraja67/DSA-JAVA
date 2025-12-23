import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {
        int[] mynumbers = {1, 8, 2, 15, 5};
        int[] result = twosum(mynumbers,13);

        System.out.println(Arrays.toString(result));
    }
    public static int[] twosum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i );
        }
        return null;
    }
}