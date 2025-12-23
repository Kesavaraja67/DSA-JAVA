import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
       int[][] arr = {
               {1, 2, 3},
               {4, 5, 100, 7},
               {8, -3, 10, 11},
               {12, 13}
       };
       int target = 9;
//       int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));

//        int ans = max(arr);
//        System.out.println((ans));

        int ans = min(arr);
        System.out.println((ans));

    }
    // Searching in 2DArray
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[] {row,col};
                }

            }

        }
        return new int[] {-1, -1};

    }

    // max
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }

            }

        }
        return max;

    }
    //min
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (min > arr[row][col]){
                    min = arr[row][col];
                }

            }

        }
        return min;

    }




}
