package Assigment2;

import java.util.Scanner;

public class EnterStringMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Naam kya hai tera");
        String name=input.nextLine();
        System.out.println("Welcome ho gya hai aapka "+name);
    }
}
