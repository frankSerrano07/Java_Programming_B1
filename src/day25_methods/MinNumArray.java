package day25_methods;

public class MinNumArray {


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
