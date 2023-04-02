package day22_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {


        String days = "Monday, tuesday,Wednesday, Thursday , Friday , Saturday , Sunday";

        String[] dayArr = days.split(",");
        System.out.println(Arrays.toString(dayArr));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");


        String month = "jan , feb , mar , apr, may , jun ,july ,aug ,sep, oct , nov ,dec";
        String[] monthArr = month.split(",");
        for (String eachMonth:monthArr) {
            System.out.println(eachMonth.substring(0, 1).toUpperCase().);
        }

    }


}