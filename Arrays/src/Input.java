import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //arr of primitives
//        int [] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 13;
//        arr[2] = 14;
//        arr[3] = 15;
//        arr[4] = 16;
//        // [12,13,14,15,16]
//        System.out.println(arr[4]);

        // input using loops
//        for(int i = 0; i < arr.length;i++){
//            arr[i] = input.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));


//        for(int i = 0; i < arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num: arr){ // for every element in array, print the element
//            System.out.println(num + " "); // here num represents elements of the array
//        }

          String[] str = new String[4];
          for (int i = 0; i < str.length; i++ ){
              str[i] = input.next();
          }

        System.out.println(Arrays.toString(str));

        //modify
        str[2] ="Kesava";

        System.out.println(Arrays.toString(str));



    }

}
