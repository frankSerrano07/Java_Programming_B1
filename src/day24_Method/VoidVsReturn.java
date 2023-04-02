package day24_Method;

public class VoidVsReturn {

    public static void sayHello () {
        System.out.println("Hello");
    }
    public static String sayBye (){ //this part is not printing out
        return "Bye";
    }
    public static void main (String[]args) {

        sayHello();
        sayBye();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

}
