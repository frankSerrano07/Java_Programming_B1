package day18_Loopz;

public class RemoveDuplicates {

    /*Write a program that can removes duplicates from a String
    ex : input = abcaabc */

    public static void main(String[] args) {

        String  word = "abcaabc";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {

            if (!unique.contains(""+ word.charAt(i))) {
                unique += word.charAt(i);
            }

        }
    }
}
