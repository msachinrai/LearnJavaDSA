package Assigment2;

import java.lang.reflect.Type;

public class DataTypesAndCasting {
    public static void main(String[] args) {

        // Type Casting
        float c = 67.56f;
        int d = (int) (c);
        System.out.println(d);

        // Auto type promotion
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        byte e = 70;
        byte f = 60;
        int g = e / f;
        System.out.println(g);
    }
}