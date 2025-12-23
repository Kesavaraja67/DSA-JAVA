public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-34,-6};
        int target = 5;
        int ans = linearSearch2(arr, target);
        System.out.println(ans);
//        System.out.println(arr[ans]);

    }

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }

        // this line will execute if none of the return statement called
        // hence the target not found
        return false;

    }

    // search for target and return element
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }

        // this line will execute if none of the return statement called
        // hence the target not found

        return Integer.MAX_VALUE;

    }



    // search in the array: return the index if item found
    // otherwise return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
       // run for loop
        for (int index = 0; index < arr.length; index++) {
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