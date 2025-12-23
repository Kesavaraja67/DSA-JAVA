public class Main {
    public static void main(String[] args) {
        // store a roll number
        int a = 13;
        // store a person name
        String name = "Kesava";

        // Syntax of an array
        // datatype[] variable_name = new datatype[size];

        //store 5 roll numbers using arr:
//        int[] rnos = new int[5];   // datatype (int) represents the type of data inside the array.
        // or directly
//        int[] rnos2 = {12,13,14,15,16};  //every element must be same data type.

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // initialisation:  actually here object is being created in the memory(heap)

//        System.out.println(ros[4]); // gives 0

        String[] arr = new String[5];
        System.out.println(arr[0]); // gives null





    }
}