package day40_exception;


public class Bank {

    double balance;

    public void withdraw (double amountToTakeOut) {
        if (amountToTakeOut > balance) {
            throw new NotEnoughMoneyException();
        }
    }



    public void login (String username, String password) throws InvalidCredential {

        if (!username.equals("tomjerry")) {
            throw new InvalidCredential("Not valid username");
        }

        if (!password.equals("0000")) {
            throw new InvalidCredential("Not valid password");
        }

    }


}