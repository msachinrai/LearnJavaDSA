package Assignment4_Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,4,5,6,6,7,8,9,4,3,2);
        multiArgs(1,2,3,"Ravi","Rogan","Josh","Haleem","Kosha","Rumali","Nihari");
    }

    private static void multiArgs(int i, int i1, int i2, String ...v) {
        System.out.println();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
