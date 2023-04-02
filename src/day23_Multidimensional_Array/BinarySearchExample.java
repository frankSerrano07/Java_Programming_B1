package day23_Multidimensional_Array;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {
        int [] num ={4,10,30,70};
        System.out.println(Arrays.binarySearch(num,4));
        System.out.println(Arrays.binarySearch(num,10));
        System.out.println(Arrays.binarySearch(num,30));
        System.out.println(Arrays.binarySearch(num,70));

        // in order tu use this method the array must be sorted!
    }
}
