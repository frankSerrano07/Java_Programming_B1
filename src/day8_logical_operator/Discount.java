package day8_logical_operator;

public class Discount {

    public static void main(String[] args) {

        boolean  isWeekend =  true;
        boolean areYouATeacher = false;
        boolean areYouAPolice = false;
        boolean areYouAFireFighter = false;

        boolean getDiscount;

        getDiscount -= isWeekend && (areYouATeacher || areYouAPolice || areYouAFireFighter);

        System.out.println(getDiscount);


    }
}
