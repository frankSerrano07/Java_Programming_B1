package day22_Arrays;

import java.util.Arrays;

public class charArray {
    public static void main(String[] args) {
        String word = "loop";
        char [] convertWord = word.toCharArray();
        System.out.println(Arrays.toString(convertWord));
        System.out.println(convertWord[0]);
        System.out.println(convertWord[1]);
        System.out.println(convertWord[2]);
        System.out.println(convertWord[3]);

        System.out.println("@@@@@@@@@@@@@@@@@@");

     for (char eachCharacter : convertWord)   {
         System.out.println(eachCharacter);

     }

     String days = "Monday - Sunday";
     char [] allLetters = days.toCharArray();
        System.out.println(allLetters[6]);
        System.out.println(Arrays.toString(allLetters));

    }
}
