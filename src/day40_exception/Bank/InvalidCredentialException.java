package day40_exception.Bank;


public class InvalidCredentialException extends Exception {

    public  InvalidCredentialException (String msg) {
        super(msg);
    }

}