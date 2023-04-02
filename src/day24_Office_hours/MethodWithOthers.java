package day24_Office_hours;
/*Create a method that accept and return the day of tge week*/


public class MethodWithOthers {
    public static String dayOfTheWeek (int num) {

        if (num >7 || num <1) {
            System.out.println("number is not in range");
            return "number is not in range.";


        }
        String[] words = {"mon" , "tue" , "wed" , "thr" , "fri" , "sat" , "sun"};
         return  words [num -1];
    }

    public static String dayOfTheWeek2 (int num) {

        String day = "";
        switch (num) {
            case 1 :
                    day = "Mon";
            break;
            case 2 :
                day ="tue";
                break;
            case 3 :
                day = "wed";
                break;
            case 4 :
                day  = "thr";
                break;
            case 5 :
                day = "fri";
                break;
            case 6 :
                day = "sat";
            case 7:
                day ="sun";
                break;
            default:
                return  "Num is not in range";


        }
        return day ;

        }

    public static String dayOfTheWeek3(int num) {

        switch (num) {
            case 1:
                return "mon";
            case 2:
                return "tue";
            case 3:
                return "wed";
            case 4:
                return "thr";
            case 5:
                return "fri";
            case 6:
                return "sat";

            case 7:
                return "sun";
            default:
                return "Num is not in range";

        }

    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(8));
        System.out.println(dayOfTheWeek2(5));
        System.out.println(dayOfTheWeek3(7));

    }

}
