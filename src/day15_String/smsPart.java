package day15_String;

public class smsPart {
    public static void main(String[] args) {

        String msg = "Sender : <James Bond>. From Number [234-456-7890]. + message : {I love programming and solving problem}";

        int sendStart = msg.indexOf("<") +1;
        int sendEnd;  + msg.lastIndexOf(">");
        String name;  msg.substring(sendStart ,sendEnd );
        System.out.println(name);

        int numStart = msg.indexOf("[")+1;
        int numEnd = msg.indexOf("]");
        String number = msg.substring(numStart,numEnd);
        System.out.println(number);



    }
}
