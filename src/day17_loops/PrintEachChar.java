package day17_loops;

public class PrintEachChar {

    public static void main(String[] args) {


        String str = "Java";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));


        System.out.println("-------------");


        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    public static class CountLetters {

        public static void main(String[] args) {
            String word = "aabbbcc";
            char  letter = 'a';

            int count = 0;


            for (int i = 0; i < word.length(); i++) {







            if (word.charAt(0) == letter) {
                count++;

            }
            }

            System.out.println(" count of the letter is : " + "count");
        }


    }
}
