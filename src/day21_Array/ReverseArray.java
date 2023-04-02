package day21_Array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] original = {1,2,3,4,5};
        int  [] reversed =  new int[original.length];

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));

        for (int i = original.length-1; i >= 0 ; i--) {
            //          i = 7


            //

            reversed[reversed.length-(i+i)] = original [i];

        }
    }
}

