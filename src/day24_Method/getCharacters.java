package day24_Method;

public class getCharacters {
    public static void printAToZ() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i + " ");
        }
        System.out.println();

    }
    public static void printaToz() {
        for (int i = 'a'; i<= 'z'; i++) {
            System.out.println((char)i++);

        }
        System.out.println();

    }

    public static void  print0To9 () {
        for (int i = 0; i <= 9; i++) {
            System.out.println();
        }
        System.out.println();
        printAToZ();
        printaToz();
        print0To9();
    }
}
