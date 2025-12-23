public class Question2 {     // this code is to find max value in a particular range
    public static void main(String[] args) {
        int [] arr = {1,2,7,4,5};
        System.out.println(maxRange(arr, 1,3));

    }
    static int maxRange(int[]arr , int start, int end){
        int maxVal = start;
        for (int i = start; i <=end ; i++) {
            if(arr[i] >  maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
