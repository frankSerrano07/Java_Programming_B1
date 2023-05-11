package day40_exception.Learn;


public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First line");

        String word = "Java";

   // Here is where the try & catch starts to resolve the exception
        try {
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }

        System.out.println("Last line");


    }
}