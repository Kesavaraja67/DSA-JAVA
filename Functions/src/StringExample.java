import java.util.Scanner;

public class StringExample {


    public static void main(String[] args) {
//            String message = greet();
//        System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = input.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
     static String myGreet(String name){
        String messages = "Hello " + name;
        return messages;
     }




//    static String greet(){
//        String greeting = "HI..!";
//        return greeting;
//    }
}
