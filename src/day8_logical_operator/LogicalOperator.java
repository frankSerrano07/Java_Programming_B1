package day8_logical_operator;

public class LogicalOperator {

    public static void main(String[]args) {


        int num = 20;

        System.out.println(num > 5);
        System.out.println(num < 5);

        System.out.println(num > 5 && num > 10);
        //                 20> 5 and 20 > 10
        //                 true  and  true ====== true output
    }
}
