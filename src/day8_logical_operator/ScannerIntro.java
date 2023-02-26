package day8_logical_operator;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        String name = "Frank";
        System.out.println("My Name is " + name);
        System.out.println("\n\n");


        System.out.println("Enter a NUmber:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("You have entered "+ number);


    }
}
