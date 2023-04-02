package day19_nested_loop;

public class NestedLoopExamoles {

    public static void main(String[] args) {

      //  for (int i = 0; i < 5; i++) {

            System.out.println("Hello Loop Academy");

            System.out.println("@@@@@@@@@@@@@@@@@@@@@");

            for (int i = 0; i < 2; i++) {  // Outer Loop.

                System.out.println("This is the number "+i+" iteration");

                for (int j = 0; j < 5; j++) { // Inner Loop.

                    System.out.println("Hello Loop Academy");
                }

            }
        }
    }

