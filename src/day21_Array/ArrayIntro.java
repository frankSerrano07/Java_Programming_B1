package day21_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        /* the normal way to declare String as i know before
        String cities = "Gettysburg","fairfax","Rockville","Bethesda","Damascus","Olney";
        @@@@@@@@@@@@@@@@@@@@
        String city1 = "Gettysburg";
        and so on up to
        String city6 = "Olney";
         */


        // This is our new way of declaring String

        String [] cities ={"Gettysburg","Fairfax","Rockville","Bethesda","Damascus","Olney"};

        // this is how to call the elements inside the String
        System.out.println(Arrays.toString(cities));

        System.out.println(Arrays.toString(cities).length());





    }
}
