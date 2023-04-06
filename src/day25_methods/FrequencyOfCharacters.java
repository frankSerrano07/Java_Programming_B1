package day25_methods;

public class FrequencyOfCharacters {

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

}