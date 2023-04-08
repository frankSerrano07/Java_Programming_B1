package day26_methods2;

import java.util.Arrays;

// create a method that accept
public class element {

    public static void main(String[] args) {

        int[] arr = {23, 4, 6, 7};// size of elements is 4 , we cant change the size in the heap memory


        add(arr, 67);
    }


    /**
     * This method accepts int array and the int num
     * And returns the a new array with the num added at the end
     */
    public static int[] add(int[] arr, int num) {

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = num;

        return newArr;

    }

    /**
     * This method accepts String array and the String word
     * And returns the new array with the word added at the end
     */
    public static String[] add(String[] arr, String word) {

        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = word;

        return newArr;

    }


}