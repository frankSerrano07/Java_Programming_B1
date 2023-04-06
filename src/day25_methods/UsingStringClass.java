package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverseStr("Java"));


    }






    public static int frequencyOfCharacters(String str, char ch) {

//"aaabbaacca ", 'a'
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }

        }
        return count;
    }


    public static String uniqueCharacters(String str) {   //aaaabbcddeeff

        String checked = "";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains(str.charAt(i) + "")) {

                int count =  StringUtil.frequencyOfCharacter(str, str.charAt(i));

                checked += str.charAt(i);

                if (count == 1){
                    unique +=str.charAt(i);


                }

            }


        }

        return unique;



    }

//this method will accept array
    public static int minNumArray (int[]arr) {

        int min = arr [0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }
        return min;

    }


}