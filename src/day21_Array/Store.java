package day21_Array;

public class Store {
    public static void main(String[] args) {


        String [ ]items = {"shoes"," jacket","Gloves","Hat","Dress","Sunglasses"};
           boolean hashat = false;

        for (int i = 0; i < items.length; i++) {

            if(items[i].equalsIgnoreCase("hat")) {

                System.out.println("hat item is available.");
                break;
            }

        }

        if (hashat) {
            System.out.println("hat item is available");
        } else {
            System.out.println("That item is out stock.");
        }

    }
}
