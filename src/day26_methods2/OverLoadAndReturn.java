package day26_methods2;

public class OverLoadAndReturn {

    public static void method (){

        System.out.println("Just printing by default");
    }



    // return type being different does not mean that they are overloaded.
    // changing the return type does not mean we overloaded the method
//        public static int method () {
//            System.out.println("Just printing by default");


    public static int method(int num){
        System.out.println("just printing ");
        return 1;
    }
}
