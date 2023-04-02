package day24_Office_hours;

public class countNumbers {

        public static  void numCounts (int num) {


            for (int i = 0; i <= num; i++) {

                System.out.println(i + " ");



        }
            System.out.println();
    }

    public static void main(String[] args) {
        numCounts(5);
        numCounts(7);
        numCounts(10);
    }
}
