package day26_methods2;

import java.security.spec.RSAOtherPrimeInfo;

public class SumOfElements {


    public static void main(String[] args) {
        int [] arr = {12, 34, 23, 12, 75};
        int [] arr2 = new int [] {34,23,465,765};

        System.out.println(sumOfElements(arr));
        System.out.println(sumOfElements(arr2));
        System.out.println(sumOfElements (new int[]{12,34,56,786,77}));
    }





    public static int  sumOfElements (int[]arr) {
        int sum = 0;
        for (int each : arr) {
            sum += each;

        }
        return sum;
    }

}
