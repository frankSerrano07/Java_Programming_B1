package day14_Strings2;

public class contains {

    public static void main(String[] args) {
        String sentence = " Judo is more than just a sport";

        System.out.println(sentence.contains("is more"));
        System.out.println(sentence.contains("more than"));
        System.out.println(sentence.contains("is than"));
        System.out.println(sentence.contains("is") && sentence.contains("than"));
        System.out.println(sentence.contains("is") || sentence.contains("than"));
        System.out.println(sentence.contains("are")||sentence.contains("than"));
        System.out.println(sentence.contains("is")&& sentence.contains("the"));
    }
}
