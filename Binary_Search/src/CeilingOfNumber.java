public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);

        System.out.println("Index: " + ans);

    }
    static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        /*
        if (arr[start] < arr[end]) {
            isAsc = true;
        }else {
            isAsc = false;
        }

         */

        // return the index of smallest number >= target
        while(start <= end ){
            //if the target number is greater than the greatest number return -1;
            if (target > arr[arr.length-1]){
                return -1;
            }
            //find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end ) exceeds the range of int in java.
            int mid = start + ( end - start ) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            }


        }

        return start;

    }

}
