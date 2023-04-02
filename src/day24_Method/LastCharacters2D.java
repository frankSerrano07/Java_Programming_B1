package day24_Method;



public class LastCharacters2D {
    public static void main(String[] args) {

        String [][] info = {

                {"James", "is ", "back"},
                {"he", "was ", "never", "gone"},
                {"methods", "tomorrow"}
        };

        for (String[]eachArr:info) {

            for (String eachWord:eachArr) {
                System.out.print(eachWord.substring(eachWord.length() - 1));

                //System.out.println(eachWord.charAt(eachWord.length()-1)); //this is the other way to access the last character
            }
            System.out.println();
        }

    }
}
