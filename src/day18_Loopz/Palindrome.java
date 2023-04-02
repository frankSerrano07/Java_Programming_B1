package day18_Loopz;

public class Palindrome {
/* palindrome is a word that it reads the same back and forth.
  examples : madam ,

  */

    public static void main(String[] args) {


        String word =            "madam";
        //index of the word       01234
        String revers = "";


        for (int i = word.length() - 1; i >= 0; i++) {
            revers += word.charAt(i);


        }

        if (word.equals(revers)) {

            System.out.println("Its a Palindrome word");

        } else {
            System.out.println("Its not a palindrome word");
        }
        System.out.println("*******************");
            System.out.println(word.equals(revers) ? "Palindrome" : "not Palindrome");

    }
}
