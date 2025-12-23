import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//       int max = a;
//       if (max < b) {
//           max = b;
//       }
//       if (max < c){
//           max = c;
//       }

//        int max = 0;
//        if (a > b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if (max < c) {
//            max = c;
//        }

        int max = Math.max(c,Math.max(a, b));
        System.out.print(max + " ");
    }
}
