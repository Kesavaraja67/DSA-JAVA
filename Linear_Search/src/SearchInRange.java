public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = -7;
        int ans = linearSearch(arr,target,1,4);
        System.out.println(ans);
//        System.out.println(linearSearch(arr,target,1,4));
    }

    static int linearSearch(int[] arr, int target,int start , int end){
        if (arr.length == 0){
            return -1;
        }
        // run for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement called
        // hence the target not found

        return -1;

    }
}
