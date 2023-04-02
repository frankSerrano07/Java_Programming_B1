package day20_nested_loops;

import java.util.Scanner;

public class FinRaInRange {

    /*   number %3  =====fin
         number %5 ======ra
         both =========finRa
     */

    public static void main(String[] args) {

        int num = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Ask a user to enter a number to check each up to that number");
        int userNum = input.nextInt();


        for (int i = 1; i <= userNum; i++) {

            String str = "";

            if (i % 3 == 0) {
                str += "Fin";


            }
            if (i % 5 == 5) {
                str += "RA";
            }
            if (str.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(str + " ");
            }

        }
    }
}