package day36_inheritance.Lyft;
public class Lyft {

    String driver;

    public Lyft (String driver) {
        this.driver = driver;
    }


    public double calculateRate (int miles) {
        return miles * 9.75;
    }

}