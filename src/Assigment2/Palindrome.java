package Assigment2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int newNum = 0;
        int oldNum = num;
        while (num != 0) {
            int remainder = num % 10;
            newNum = newNum * 10 + remainder;
            num /= 10;
        }
        System.out.println(newNum);
        if (oldNum == newNum) {
            System.out.println(newNum + " is a Palindrome");
        } else {
            System.out.println(newNum + " is not a Palindrome");
        }
    }
}
