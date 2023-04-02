package day18_Loopz;

public class BranchingExample {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                System.out.println(i + " ");
                break;
            }
            System.out.println(i + " ");

            System.out.println("--------------------");
            for (int a = 0; i <= 10; i++) {
                if (a == 5) {
                    continue;
                }
                System.out.println(i + " ");
            }
        }
    }

}