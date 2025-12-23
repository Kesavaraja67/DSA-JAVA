import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            Syntax of for loops;

            for (initialization; Condition; increment/decrement){
                // body
            }

        */

//        for(int num = 1; num <= 5; num +=2){
//            System.out.println(num);
//        }

//        int n = input.nextInt();
//        for (int num = 1; num <=n ; num++) {
//            System.out.print(num + " ");
//            System.out.println(num);
//
//        }

        // while loops

//        initialization
//        while (condition){
          // body
            // increment/decrement

//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num+=1;
//
//        }
        /*
        Use for loop when you know how many times the loop is going to run
        Use while loop when you don't know how many times the loop is going to run
         */

//        do while loop
        /*
        do{
            //body
        } while (condition);
         */

        int num = 1;
        do{
            System.out.println(num);
            num+=1;
        }while(num<=10);
    }
}
