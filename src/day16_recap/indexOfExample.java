package day16_recap;

public class indexOfExample {

    public static void main(String[] args) {
        String str = "banana";
        System.out.println(str.length());

        String firstChar = "" + str.charAt(0);
        System.out.println(firstChar);


        firstChar = str.substring(0, 1);
        System.out.println(firstChar);


        String lastChar = "" +  str.charAt(str.length()-1);
        System.out.println(lastChar);

        System.out.println(str.lastIndexOf( "n"));
    }

}
