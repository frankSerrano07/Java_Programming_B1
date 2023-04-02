package day10_a_if_Statement;

public class Overtime {

    public static void main(String[] args) {

        double hourlyRate = 0.00;
        double workHours = 0.00;
        double netPay =0.00;

        double extraHours = workHours -40;
        netPay = hourlyRate* workHours;


        // if I have worked more than 40 hours
        //  netPay = netPay * extraHours * hourlyRate *1.5;
        netPay += extraHours * (hourlyRate * 1.5);
        System.out.println(("You worked " + workHours + "hours at the rate of " +
                hourlyRate + " , but with " + extraHours + " extra hours overtime" );


    }
}
