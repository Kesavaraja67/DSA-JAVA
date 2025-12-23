import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(123);
//        list.add(13);
//        list.add(23);
//        list.add(12);
//        list.add(3);
//        list.add(123);
//        list.add(13);
//        list.add(23);
//        list.add(12);
//        list.add(3);
//        list.add(123);
//        list.add(13);
//        list.add(23);
//        list.add(12);
//        list.add(3);
//
//
//        System.out.println();
//        System.out.println(list.contains(123));
//        System.out.println(list.contains(1));
//
//        System.out.println(list);
//        System.out.println();
//        list.set(0, 99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());

        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here

        }

        System.out.println(list);
    }
}
