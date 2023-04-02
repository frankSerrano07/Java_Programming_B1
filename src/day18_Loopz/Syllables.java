package day18_Loopz;

import java.util.Scanner;

public class Syllables {

    public static void main(String[] args) {



        String  word = "Fran-cis-co";

        int count = 0;





        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ' ') {
                count++;
            }

            System.out.println( "the count of a Syllables " + (count +1));

        }
    }
}

















