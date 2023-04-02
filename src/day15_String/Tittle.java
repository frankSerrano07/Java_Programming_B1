package day15_String;

import java.util.Scanner;

public class Tittle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name , with Titles: ");

        String nameAndTitle = input.nextLine();

        if (nameAndTitle.startsWith("Mr") || nameAndTitle.startsWith("Mister")) {
            System.out.println("Hello sir");
        } else if (nameAndTitle.startsWith("mrs") || nameAndTitle.startsWith("Madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("Dr") || nameAndTitle.startsWith("Doctor")) {
            System.out.println(("Hello Doctor"));
        }

        if (nameAndTitle.startsWith("Jr")) {
            System.out.println(" Hello Junior");
        } else if (nameAndTitle.startsWith("Sr")) {
            System.out.println("Hello Senior");
        }


    }


}