package day21_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {

        String [] student1 = {"B001", "Tom", "Jerry","B#1"};

        System.out.println("This is the info for Student 1 :" + Arrays.toString(student1));
        System.out.println(student1);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String [] student2 = new String[4];
        System.out.println("This is the info for student 2:"+ Arrays.toString(student2));
        student2[0] =   "B007";
        student2 [1]  =   "john";
        student2[2]  =  "Wick";
        student2[3] = "B#2";
        System.out.println("This is the info for student 2:"+ Arrays.toString(student2));


        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String [] student3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Id");
        student3[0] = input.next();

        System.out.println("Enter your name:");
        student3[1] = input.next();
        System.out.println("Enter your last name :");
        student3[2] = input.next();
        System.out.println("Enter your Batch number:");
        student3[3] = input.next();
        System.out.println("this is the info for student 3:"+ Arrays.toString(student3));

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        String [] questions = {"Enter Id","enter name ","Enter last name ","Enter Batch No:"};

        String  [] student4 = new String[4];
        for (int i = 0; i < 4; i++) {

        //for  (int i = 0; i < questions.length; i++) {

        // you can do this also
            System.out.println(questions[i]);

        //reading each element of the questions array
        student4[i] = input.next();
        //assigning the Scanner input (input user)onto student 4 Array

        }
            System.out.println("This is the info for student 4:"+ Arrays.toString(student4));

        }
    }

