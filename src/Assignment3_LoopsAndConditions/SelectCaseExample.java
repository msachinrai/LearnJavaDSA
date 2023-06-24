package Assignment3_LoopsAndConditions;

import java.util.Scanner;

public class SelectCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fruit name: ");
        String fruit = input.next();
        switch (fruit) {
            case "mango":
                System.out.println("Raja Hai Hum");
                break;
            case "apple":
                System.out.println("khao aur doc bhagao");
                break;
            case "banana":
                System.out.println("khali naam kharaab h");
                break;
            case "grapes":
                System.out.println("khao ya pio");
                break;
            default:
                System.out.println("aur nahi hote fruit");
                break;
        }
    }
}
