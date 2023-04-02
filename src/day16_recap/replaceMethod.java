package day16_recap;

public class replaceMethod {

    public static void main(String[] args) {
        String str = "java language";

        str = str.replace('a', 'u');// juvu lunguuage
        System.out.println(str);

        String str2 = "Today is Thursday, Thursday is good";
        str2 =  str2.replace("Saturday", "Monday");
        System.out.println(str2);
    }
}
