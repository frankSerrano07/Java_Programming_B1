package day26_methods2;

public class arrayIndexOf {

    public static void main(String[] args) {

        String str ="loop";
        int index = str.indexOf("l");

        int [] arr = {3, 1, 547, 34 , 27};
        int  num = 547;
    }

    public static int indexOf(int [] arr, int num ) {

        int locationOfElement = 0;


        for (int each : arr) {
            if (each == num) {
                return locationOfElement;
            } else {

                locationOfElement++;
            }
        }
        /* byte , short , int , long , float , double */
        return -1;
    }

public static  int indexOf2 (int[]arr, int num) {

    for (int i = 0; i < arr.length; i++) {

        if (arr[1] == num) {
            return 1;

        }

    }


    return num;
}


}
