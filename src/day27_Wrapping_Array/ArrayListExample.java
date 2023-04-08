package day27_Wrapping_Array;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>(); //the capacity is 10 in the heap memory by default.
        System.out.println(numbers.size());

        System.out.println("@@@@@@@@@@@@@@@@@@@@");

        System.out.println(numbers);
        numbers.add(10);            //  once i use add() method, it adds it to the end ot the ArrayList

        System.out.println(numbers);

        numbers.add(-200);         // once i use add() method and give argument as -200, it adds it to the end ot the ArrayList
        System.out.println(numbers);


        System.out.println(30);
        System.out.println(300);
        System.out.println(numbers);

        System.out.println(numbers.size());

        // How can I get the element which is in the 1st index?
        // In array to get the specific indexed element we used  arr[1];



        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(4));  // index out bound exception


    }
}
