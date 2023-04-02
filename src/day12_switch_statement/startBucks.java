package day12_switch_statement;

import java.util.Scanner;

public class startBucks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();

        double price =0.00;
        int calories = 0 ;
        System.out.println("Which size drink they want");
        String size = input.next();
        boolean isSize = true;


        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;

            case "grande ":
                price = 4.00;
                calories = 200;
                break;
            case "venty":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We do not have that size");
                isSize = false;
        }
        System.out.println("Your order for " + size +"and calories "+ calories);

    }
}
