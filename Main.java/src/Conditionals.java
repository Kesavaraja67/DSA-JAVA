import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            Syntax of if statements:
            if (boolean expression T or F){
               // body
            } else do this

            }
         */
//        System.out.print("Enter The Salary: ");
//
//        int Salary = input.nextInt();
//        if(Salary >= 25000) {
//            Salary = Salary + 20000;
//         }
//
//          else{
//                Salary = Salary + 10000;
//
//            }
//        System.out.println("This Month Your Salary is " + Salary);

          int Salary = input.nextInt();
          if(Salary > 50000){
              Salary += 25000;
          } else if (Salary > 25000) {
              Salary += 20000;
          } else {
              Salary += 15000;
          }
        System.out.print("Your Salary is: " + Salary);

    }
}
