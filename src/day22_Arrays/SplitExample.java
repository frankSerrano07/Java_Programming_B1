package day22_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {


        String days = "Monday, tuesday,Wednesday, Thursday , Friday , Saturday , Sunday";

        int countWords  = 0;
        for (int i = 0; i < days.length(); i++) {
            if (days.charAt(i)) == ' , ') {
               countWords++;
            }
        }
        System.out.println("total words: " + (countWords+1));
        String [] dayArr = days.split(' , ');
        System.out.println(Arrays.toString(dayArr));
        String [] dayArr1 = days.split(" , ");

        }

    }





