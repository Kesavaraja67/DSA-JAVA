import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        boolean ans = isArmstron(n);
//        System.out.println(ans);
//        System.out.println(isArmstron(n));

        for (int i = 100; i < 1000 ; i++) {
            if (isArmstron(i)){
                System.out.print(i + " ");
            }

        }
    }
    // print all the 3 digits armstrong numbers

    static boolean isArmstron(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }
}
