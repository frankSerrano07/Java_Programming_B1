package day21_Array;

public class addElements {
    public static void main(String[] args) {

        int  [] nums = {3,6 , 10 };
        System.out.println("Total:"+ (nums[0]+nums[1]+nums[2]));
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];


        }
        System.out.println("total:"+ total);
    }

}
