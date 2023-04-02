package day21_Array;
/*

 */


import java.util.Scanner;

public class SelectMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter which month number you want");
        int monthNum = input.nextInt();

          String [] allMonth = {"January", "February"};

        System.out.println("The number you enter represent this month: " + allMonth[monthNum-1]);
    }


}
