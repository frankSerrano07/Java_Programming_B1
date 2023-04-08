package day26_methods2;

public class painter {


    public static void main(String[] args) {
        picture.draw();
        picture.draw(45);
        picture.draw("Black", "white");


        int num = 6;
        String str = "Test";
        picture.draw(str, num);

    }
}