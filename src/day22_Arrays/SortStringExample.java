package day22_Arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] str = {"java , loop , while , softskill, hello ,bye ,$ ,54TesT" };
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));



    }


}
