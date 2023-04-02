package day12_switch_statement;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter 1st number");

        double numBOne = input.nextDouble();
        System.out.println(" select operator : \n\t + \n\t - \n\t * \n\t ? \n\t % \n\t Enter");
        String operator = input.next();
        System.out.println("Enter 2nd number");
        double numTwo = input.nextDouble();


        double result = 0.0;

        switch (operator) {
            case "+":
                result = numBOne + numTwo;
                        break;

            case "-":



                if ( numBOne > numTwo) {
                    result = numBOne - numTwo;

                }else {
                    result = numBOne * numTwo;
                            break;

                }
        }







    }
}
