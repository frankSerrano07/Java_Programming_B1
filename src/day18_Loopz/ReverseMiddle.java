package day18_Loopz;

import java.util.Scanner;

public class ReverseMiddle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words in a sentence: ");
        String str = input.nextLine();

        // I love Java
        //012345678910

        int firstSpace = str.indexOf(" "); //1
        int lastSpace = str.lastIndexOf(" "); //7


        String middle = str.substring(firstSpace+1, lastSpace);

        String reverse  = "";
        for (int i = middle.length()-1; i >=0 ; i--) {
            reverse += middle.charAt(i);



        }
        System.out.println(str.substring(0,firstSpace)+ "" + reverse+ "" + str.substring(lastSpace+1));
    }
}
