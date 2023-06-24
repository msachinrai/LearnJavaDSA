package Assignment3_LoopsAndConditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (true) {
            // taking operation type
            System.out.print("Enter operator: ");
            char ch = input.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                // Taking number inputs from user
                System.out.print("Enter two number's : ");
                int n1 = input.nextInt();
                int n2 = input.nextInt();

                //Performing operation
                if (ch == '+') {
                    result = n1 + n2;
                } else if (ch == '-') {
                    result = n1 - n2;
                } else if (ch == '*') {
                    result = n1 * n2;
                } else if (ch == '/') {
                    result = n1 / n2;
                } else if (ch == '%') {
                    result = n1 % n2;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid Entry, try again");
            }
            System.out.println("The result of operation is: " + result);
        }
    }
}
