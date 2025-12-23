import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // Ask for the operator from the user;
            System.out.print("Enter the operation: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }if (op == '-') {
                    ans = num1 - num2;
                }if (op == '*') {
                    ans = num1 * num2;
                }if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }if (op == '%') {
                    ans = num1 % num2;

                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid operation.");
            }
            System.out.println(ans);
        }


    }
}

