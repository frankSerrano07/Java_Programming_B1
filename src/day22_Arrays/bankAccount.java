package day22_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bankAccount {


    public static void main(String[] args) {


        String[] bankAccOne = {"Tj", "Checking", "123456789", "100,000.000"};
        System.out.println("Number of the elements in the array:" + bankAccOne.length);
        System.out.println("My entire array:" + Arrays.toString(bankAccOne));
        System.out.println("name:" + bankAccOne[0]);
        System.out.println("account type:" + bankAccOne[1]);
        System.out.println("Account No:" + bankAccOne[2]);
        System.out.println("Available Balance:" + bankAccOne[3]);


        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String[] bankAccTwo = new String[4];

        System.out.println("Array with default values:" + Arrays.toString(bankAccTwo));

        bankAccTwo[0] = "Frank";
        bankAccTwo[1] = "Busy";
        bankAccTwo[2] = "123456789";
        bankAccTwo[3] = "200,000.000";

        System.out.println("My entire array 2 :" + Arrays.toString(bankAccTwo));

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


        String[] bankAccThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Name:");
        bankAccThree[0] = input.next();
        System.out.println("Account Name:");
        bankAccThree[1] = input.next();
        System.out.println("Account type:");
        bankAccThree[3] = input.next();
        System.out.println("Account Balance");
        System.out.println("My entire Array 3:" + Arrays.toString(bankAccThree));

        System.out.println("@@@@@@@@@@@@@@@@@@@@@");

        String[] question = {"Name:", "Account Type", "Account No", "Account Balance:"};

        String[] bankAccountFour = new String[4];
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            bankAccountFour[i] = input.nextLine();

        }
        System.out.println("My entire Array 4:" + Arrays.toString(bankAccountFour));


    }


}

