package day30_b_Custom_Classes;

public class Animal {




        String species;
        long population;

        public void fly () {
            System.out.println(species + " are flying ");
        }


        public String toString () {
            String print  ="Species " + species + "\nPopulation " + population;

            return print;
        }

    }




