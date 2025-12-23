import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temp in C: ");
        float TempC = input.nextFloat();
        float TempF = (TempC * 9/5) + 32;
        System.out.println("Temp in F is: " + TempF);
    }
}
