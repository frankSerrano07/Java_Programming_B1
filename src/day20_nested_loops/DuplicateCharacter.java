package day20_nested_loops;

public class DuplicateCharacter {


    public static void main(String[] args) {



        String  str = "AAABCCDEEF";

        for (int i = 0; i < str.length(); i++) {

            int count =0;

            if(uniqueChar.contains(""+str.charAt(i))) {
                continue;
            }


            for (int j = 0; j < str.length(); j++) {


                if (str.charAt(i)  == str.charAt(j)) {
                     count++;
                }

            }
            if (count>1) {
                System.out.println(str.charAt(i));
            }

            uniqueChar += str.charAt(i);
        }

    }

}
