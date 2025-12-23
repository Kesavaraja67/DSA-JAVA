import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empID = input.nextInt();
        String department = input.next();
//        switch (empID){
//            case 1:
//                System.out.println("Kesava");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("Enter department");
//                }
//                break;
//            case 2:
//                System.out.println("Raja");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("Enter department");
//                }
//
//                break;
//            case 3:
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("Enter department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct empID");


        // better way to write
        switch (empID) {
            case 1 -> {
                System.out.println("Kesava");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter department");
                }
            }
            case 2 -> {
                System.out.println("Raja");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter department");
                }
            }
            case 3 -> {
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter department");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
