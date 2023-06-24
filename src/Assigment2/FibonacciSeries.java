package Assigment2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last value of Fibo series: ");
        int lastNum = input.nextInt();
        System.out.print(n1 + " " + n2+" ");
        for (int i = 2; i < lastNum; i++) {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
