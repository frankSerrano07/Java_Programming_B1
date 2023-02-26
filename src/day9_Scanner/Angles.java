package day9_Scanner;


import java.util.Scanner;
public class Angles {

    public static void main(String[] args) {

        //Create a Scanner object
        Scanner input = new Scanner (System.in);

        //ask the user to enter 3 angle numbers
        System.out.println("Entre 3 angle numbers");
        double degreeOne = input.nextDouble();
        double       degreeTwo = input.nextDouble();
         double       degreeThree = input.nextDouble();

         //Calculate the total of the 3 angles

        double total =  degreeOne + degreeTwo + degreeThree;

        //Write a print statement
        System.out.println(" Its a triangle:" + (total == 180));

        //write a print statement if is a circle
        System.out.println("It is a circle :" + (total == 360));

        // Write a print statement if Either triangle or circle
        System.out.println("It is either triangle or circle :" + (
                total == 180 || total == 360));

    }
}


