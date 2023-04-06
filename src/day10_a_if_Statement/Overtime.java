package day10_a_if_Statement;

public class Overtime {

    public static void main(String[] args) {

        double hourlyRate = 100.00;
        double workedHours = 30.00;

        double netPay = 0;

        double extraHours = workedHours -40;
        netPay = 0;

        if (workedHours>40){
            netPay  = netPay + extraHours * (hourlyRate *1.5);
            netPay += extraHours *(hourlyRate * 1.5);


        // if I have worked more than 40 hours
        //  netPay = netPay * extraHours * hourlyRate *1.5;
        netPay += extraHours * (hourlyRate * 1.5);
        System.out.println(("You worked " + workedHours + "hours at the rate of " +
                hourlyRate + " , but with " + extraHours + " extra hours overtime.so , you get  in total pay of $" + netPay);
    } else {
        netPay = workedHours + hourlyRate;

        System.out.println("You worked " + workedHours + "hours at the rate of "+ hourlyRate + "So, you get in total pay of $" + netPay;

    }



    }