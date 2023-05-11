package day40_exception;


public class InvalidCredential extends Exception {

    public InvalidCredential(String msg) {
        super(msg);
    }

}