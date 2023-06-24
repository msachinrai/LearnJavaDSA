package Assignment4_Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Prime number to check: ");
        int num = input.nextInt();
        System.out.println("The given number is prime: " + primeCheck(num));
    }

    private static boolean primeCheck(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

