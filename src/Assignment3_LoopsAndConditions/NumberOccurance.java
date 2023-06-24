package Assignment3_LoopsAndConditions;

import java.util.Scanner;

public class NumberOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numIn = input.nextInt();
        int num, temp, count = 0, numCheck = 5;
        num=numIn;
        while (num > 0) {
            temp = num % 10;
            if (temp == numCheck) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("The number of times " + numCheck + " has occured in " + numIn + " is: " + count);
    }
}
