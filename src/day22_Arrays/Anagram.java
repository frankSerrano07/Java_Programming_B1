package day22_Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 =  "silent";

        //1
        String [] arr1 = word1.split("");
        char [] wordArr1 = word1.toCharArray();
        char [] wordArr2 = word2.toCharArray();

        // 2 sort both arrays
        Arrays.sort(wordArr1);
        Arrays.sort(wordArr2);

        //3 compare two arrays
        System.out.println(Arrays.equals(wordArr1,wordArr2)? "Anagram":"Not Anagram");
    }
}
