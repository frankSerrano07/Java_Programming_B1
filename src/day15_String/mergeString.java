package day15_String;

public class mergeString {
    public static void main(String[]arg) {


        String a = "abc";
        String b = "xyz";

        String mergeOne = a + b;
        System.out.println(mergeOne);

        String mergeTwo = "" + a.charAt(0) + a.charAt(1);
        System.out.println(mergeTwo);


        mergeTwo += a.charAt(2);
        mergeTwo += b.charAt(0);
        mergeTwo += b.charAt(1);
        mergeTwo += b.charAt(2);
        System.out.println(mergeTwo);
    }



    }

