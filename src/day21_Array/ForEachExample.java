package day21_Array;

public class ForEachExample {
    public static void main(String[] args) {

        int[] nums = {30, 12, 159, 12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("With traditional for loop :" + nums[i]);

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            for (int each : nums) {
                System.out.println("With foreach for loop:" + each);


            }
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            String[] words = {"Java ", "Soft Skill", "Selenium", "SQL", "API"};
            for (int j = 0; j < words.length; j++) {
                System.out.println("With traditional for loop :" + words[i]);


                for (String eachWord : words) {
                    System.out.println("with for each loop :" + eachWord);


                    if (eachWord.equalsIgnoreCase("selenium")) {
                        System.out.println("With foreach loop :" + eachWord.substring(2, 4));
                    }


                }
            }
        }
    }
}