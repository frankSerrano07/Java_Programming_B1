package day18_Loopz;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");

        int count = 0;

        String sentence = input.nextLine().trim();



        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == ' ') {
                count++;
            }

            System.out.println( "the count of word" + (1));

        }
    }
}
