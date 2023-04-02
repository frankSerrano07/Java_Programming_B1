package day11_if_statement;

import java.util.Scanner;

public class LogingApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4 digit pin code:");
        int usePinCode = input.nextInt();

        System.out.println("Enter your 4 SSN digits:");
        int userSsnDigits = input.nextInt();

        int expectedPinCode = 1234;
        int expected4SsnDigit = 4321;

        if (usePinCode == expectedPinCode && userSsnDigits == expected4SsnDigit) {
            System.out.println("logged in successfully");
        } else {
            System.out.println("Authentication failed!");

            if (usePinCode != expectedPinCode) {
                System.out.println("You have an invalid pin code");
            }

            if (userSsnDigits != expected4SsnDigit) {
                System.out.println("You have an invalid SSN 4 digits");
            }
        }
    }
}
