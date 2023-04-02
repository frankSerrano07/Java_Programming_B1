package day23_Multidimensional_Array;

import java.util.Arrays;

public class AWS {

    public static void main(String[] args) {
        String app ="amazon";
        String zones = "us -east-1, us-west-1 ,us -west-2, us-west-3";

        String [] envArr = zones.split(",");

        System.out.println(Arrays.toString(envArr));

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


        for (int i = 0; i < envArr.length; i++) {
            System.out.println(app + "is being deploy to the environment" + envArr[i]);


        }



    }


}
