package day8_logical_operator;

public class EligibleToVote {

    public static void main(String[] args) {

        String  name = "Ram" ;
        boolean isCitizen = true;
        boolean hasCriminalBacKGround = true;
        int age = 49;

        boolean isEligible;

        isEligible = age >= 18 && isCitizen && !hasCriminalBackGround;

        System.out.println( name + "is eligible to vote " + isEligible);


    }
}
