package day22_Arrays;


import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is Wednesday and we learned some useful methods";

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words);

        String reversed = "";

        for (int i = words.length-1; i >= 0 ; i--);
        reversed += words[i] + " ";
        System.out.println(Arrays.toString(words));

    }



}
