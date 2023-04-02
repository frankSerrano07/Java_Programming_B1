package day24_Method;

public class Greetings {
    public static void main(String[] args) {
        sayHelloToWhom();
        sayHello("Enzo");
        sayHello("Dilan");
        sayHello("Mariela");
    }


    public static void sayHelloToWhom() {
        System.out.println("Hello Frank ,.hope you are great:");


    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name + ".hope you are great!");


    }
}