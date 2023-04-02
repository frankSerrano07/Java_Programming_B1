package day14_Strings2;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String word1 = "las minute";
        System.out.println(word1.isEmpty());


        word1 = "";
        System.out.println(word1.isEmpty());
        System.out.println(word1.isBlank());

        word1 = " y ";
        System.out.println(word1.isEmpty());
        System.out.println(word1.isBlank());








    }
}
