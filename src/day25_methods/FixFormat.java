package day25_methods;

import my_util.StringUtil;

import javax.swing.text.SimpleAttributeSet;

public class FixFormat {

    public static String fixFormat(String str) {
    String fixed =  str.trim();
    fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

    return fixed;


        System.out.println(StringUtil.reverseStr());


    }
}


