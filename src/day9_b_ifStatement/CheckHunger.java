package day9_b_ifStatement;


import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        //create a Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.println("Frank are you hungry(true or false:");
        boolean isHungry = input.nextBoolean();


        if (isHungry) {
            System.out.println("Lets go to Texas de Brazil");

        } else {
            System.out.println("i cant do anything. Give something Vulma");

        }

    }

}

