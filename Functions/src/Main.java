import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q: Take input from the user and print the sum
        int num1,num2,sum;

        System.out.println("Enter number 1: ");
         num1 = input.nextInt();
        System.out.println("Enter number 2: ");
         num2 = input.nextInt();
         sum = num1 + num2 ;
        System.out.println("The Sum of two numbers is:" + " " +sum );


    }
}