package day14_Strings2;

import java.util.Scanner;

public class login {

    String correctUserName = "name";

    public static void main(String[] args) {

        Scanner input = new Scanner("System.in");
        System.out.println("Please , enter your username: ");

        String userName = input.next();

        userName = userName.toLowerCase();

        System.out.println("Please , enter a password");
        String password = input.next();

        int passwordLength  = password.length();
        System.out.println(passwordLength);

        if ( passwordLength >= 8 && userName.equals("correctUserName")) {
            System.out.println("You are logged as " + userName);
        } else {
            if (passwordLength <8 ) {
                System.out.println("Password does not match ");

            }

            if (userName.equals("correctUserName")) {
                System.out.println("Invalid username ");
            }
        }
    }
}
