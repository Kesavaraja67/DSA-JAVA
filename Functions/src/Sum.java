import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(25,25);
        System.out.println(ans);


    }

    //pass the values of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }



    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
//      System.out.println("This will never executed");
    }
    static void sum () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of two numbers is:" + " " + sum);
    }
    /*
       return_type name (arguments){
         //body
         return statement;
         }
     */
}
