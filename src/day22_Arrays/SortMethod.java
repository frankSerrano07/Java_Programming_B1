package day22_Arrays;

import java.util.Arrays;

public class SortMethod {

    public static void main(String[] args) {
        int [ ] nums = {2,3,4,5,6,7,};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min:" +nums[0]);
        System.out.println("max:" +nums[nums.length-1]);
    }
}
