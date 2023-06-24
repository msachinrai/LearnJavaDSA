package Assigment2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check for even or Odd");
        int numToCheck = input.nextInt();
        if(numToCheck%2==0)
            System.out.println("The given number "+numToCheck+" is a even number");
        else
            System.out.println("The given number "+numToCheck+" is a odd number");

    }
}
