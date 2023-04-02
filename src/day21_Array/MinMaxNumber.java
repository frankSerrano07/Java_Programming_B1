package day21_Array;

public class MinMaxNumber {
    public static void main(String[] args) {

        int [] nums ={500, 120, -80, 90,250,-10};

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int each = nums[i];
            if(each > max) {
                max = each;
            }

        }
        System.out.println("max"+ max);
        System.out.println("min"+ min);
    }
}
