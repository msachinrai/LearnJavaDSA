package Assignment4_Functions;

import java.util.Scanner;

public class ThreeDigitArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" All the 3 digit armstrong numbers are as follows : ");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean isArmstrong(int check) {
        int num = check, newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            newNum += Math.pow(rem, 3);
        }
        return newNum == check;
    }
}