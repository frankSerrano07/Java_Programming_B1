package day16_recap;

public class California {
    public static void main(String[] args) {

        String word = "California";

        boolean isEven = word.length()%2 == 0;

        if (isEven) {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        }else {

            System.out.println(word.substring(word.length()/2- word.length()/2 +1 ));

        }
    }
}
