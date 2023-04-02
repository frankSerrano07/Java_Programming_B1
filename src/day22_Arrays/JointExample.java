package day22_Arrays;

import java.util.Arrays;

public class JointExample {
    public static void main(String[] args) {


        String[] str = {"a", "b", "c"};
        System.out.println(Arrays.toString(str));
        System.out.println(String.join("<>", str));
        System.out.println(String.join("---", str));
        System.out.println(String.join("****", str));
        System.out.println(String.join("", str));


    }
}
