package day8_logical_operator;

public class Speeding {


    //Note ; if the requirement is not clear , ask the question

    public static void main(String[] args) {

        int currentSoeed = 65;
        int speedLimit = 65;

        boolean isSpeeding = currentSoeed <= speedLimit;

        System.out.println("Is this person speeding" + isSpeeding);

    }
}
