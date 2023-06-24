package Assignment3_LoopsAndConditions;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a emp detail: ");
        int empID = input.nextInt();
        String dept = input.next();

        switch (empID) {
            case 1:
            case 3:
            case 2:
            case 5:
            case 6:
                System.out.println("emp id is: " + empID);
                break;
            case 4:
                System.out.println("emp id is: " + empID);
                switch (dept) {
                    case "IT":
                        System.out.println("Laptop thik karo");
                        break;
                    case "Admin":
                        System.out.println("Support waale");
                        break;
                    case "Engg":
                        System.out.println("Engg wala");
                        break;
                    case "Recep":
                        System.out.println("HR waale");
                        break;
                    default:
                        System.out.println("Kahi aur ka hai");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + empID);
        }
    }
}
