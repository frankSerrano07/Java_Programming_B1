package day23_Multidimensional_Array;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
        int [] n = {2,3,4,5,};
        int [] m = {10,33,37,47};

        int [] [] all = {m ,n};
        System.out.println(all);
        System.out.println(n);

        System.out.println(Arrays.toString(all)); // printing 20 arrays
        System.out.println(Arrays.toString(n)); //printing b1d arrays
        System.out.println(Arrays.deepToString(all));// correct way to print 2d array

        System.out.println("fIRST ARRAY:" +Arrays.toString(all[0])); //HERE PRINTING 1ST 10 ARRAYS\ IN THE 2D ARRAY.
        System.out.println("Second array:"+ Arrays.toString(all[1]));  //Here printing second 1d array in the 2d array.




    }

}
