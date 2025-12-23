public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(max(arr));

    }
    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr){
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    // find maximum
    static int max(int[] arr){
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maximum < arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }


}
