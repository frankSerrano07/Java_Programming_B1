package day23_Multidimensional_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,};

        Scanner input = new Scanner(System.in);
        System.out.println("What dou you want your Array size to be ?");
        int arrOneSize = input.nextInt();

        int [] arr1 = new int[arrOneSize];
        System.out.println(Arrays.toString(arr1));

        System.out.println ("Add your elements one at the time :");
        for (int i = 0 ; i<arr1.length; i++){
            arr1[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr1));

        System.out.println("How many more element you want to add:");
        int addNum = input.nextInt();
        int [] arr2 = Arrays.copyOf(arr1,arr1.length+addNum);
        System.out.println(Arrays.toString(arr2));


    }
}
