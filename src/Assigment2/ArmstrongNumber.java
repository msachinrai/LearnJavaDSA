package Assigment2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int temp = 0, newNum = 0, rem = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int oldNum = input.nextInt();
        //Get each reminder and cube it
        temp = oldNum;
        while (temp > 0) {
            rem = temp % 10;
            //newNum += rem * rem * rem;
            newNum +=Math.pow(rem,3);
            temp = temp / 10;
        }
        if (oldNum == newNum) {
            System.out.println("The given Number is Armstrong Number : " + newNum);
        } else {
            System.out.println("The given Number is not a Armstrong Number : " + newNum);
        }
    }
}
