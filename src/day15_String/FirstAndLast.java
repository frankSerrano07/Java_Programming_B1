package day15_String;

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = input.nextLine();

        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("last char: " + sentence.charAt(sentence.length()-1));


        int length = sentence.length();
        System.out.println("Last char : " + sentence.charAt(--length));
    }
}
