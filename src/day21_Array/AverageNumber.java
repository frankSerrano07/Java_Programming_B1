package day21_Array;

public class AverageNumber {

    public static void main(String[] args) {


        int [] arr1 = {1,2,3};
        int total = 0;
        for (int each: arr1) {
            total += each;

        }
        System.out.println("average :" + (total/ arr1.length));

        System.out.println("the total:"+total+"\nElement amount:"+arr1.length +
                "\nAverage is :" + (total/arr1.length));
    }
}
