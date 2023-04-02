package day24_Method;

public class CreditScore {

    public static int getCreditScore() {
        return 800;
    }
    public static boolean isGoodCreditHistory (int score) {
        if (score >= 750) {
            return "Great";
        }else if (score>=720 && score <=750) {
            return "Good";
        } else {
            return "Poor";


        }

}
    public static  void main (String[] args) {
        int score = getCreditScore();
        System.out.println(score);
        System.out.println(getCreditScore() + 50);


    }
}
