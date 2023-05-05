package day38_b_polyphormism.animal;

public class Lizard extends Reptile{
    String skinColor;

    @Override
    public void eat(){
        System.out.println("Lizard is eating");
    }
}
