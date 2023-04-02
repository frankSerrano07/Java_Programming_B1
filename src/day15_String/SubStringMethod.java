package day15_String;

public class SubStringMethod {


    public static void main(String[] args) {


        String str = "Saturday";

        System.out.println(str.substring(3));
        System.out.println(str.substring(6));
        System.out.println(str);

        System.out.println(str.substring(2, 5));
        System.out.println(str.substring(0, 5));


        System.out.println(str.substring(0, 5 ) + "day");

    }

}