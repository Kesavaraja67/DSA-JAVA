import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // giving input as int and its converting into float;
        // because float is greater integer
        // left hand side should be greater than right hand side;
        // giving float as an input when int is asked than it will give error;

        //TypeCasting
//        int num = (int)(99.99f);
//        System.out.println(num);
        // automatic type promotions in expressions
//           int a = 257;        // 257 % 256 = 1
//           byte b = (byte)(a);
//        System.out.println(b);

//         byte a = 20;
//         byte b = 30;
//         byte c = 100;
         // byte cannot store 20*30 so it will automatically convert into int when expressions are called.
//         int d = a * b/c;
//        System.out.println(d);
//
//        byte f = 40;
//        f = f*2;        // gives error because f is not assigned with any data type.

//        int number = 'A';
//        System.out.println(number); // Gives 65 as output, A's Unicode value is  65.
//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//
//        double result = (f * b) + (i / c) - (d * s);
//
// float + int - double = double

//        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
//        System.out.println(result);

//        int Count = 1;
//         while(Count != 5) {
//        System.out.println(Count);
//        Count++;
//        }

          // For loop
        for(int count = 1; count !=5; count++){
            System.out.println(count);
        }
    }
}
