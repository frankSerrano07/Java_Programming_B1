package day34_b_Encapsulation.Square.Pizza.Import;

import java.util.Arrays;

public class NormalImport {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};


        Arrays.sort(a);
        // sort(a); // since we have not done the static import we can not call the method by the name only

    }

}



