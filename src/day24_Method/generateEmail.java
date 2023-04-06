package day24_Method;

public class generateEmail {

//Created a method that takes two arguments as a name and domain.
// and print out the email address made out   of the name and domain.


    public static void generateEmail(String name , String domain)  {
        String email = name.toLowerCase() + "@" + domain.toLowerCase() + ".com";
        System.out.println("Your email address: " +email);
     }

    public static void generateEmailFromName(String fullName, String domain)  {
        String email = fullName.substring(0, fullName.indexOf(" ")).toLowerCase() + "@" + domain.toLowerCase() + ".com";
        System.out.println(email);
    }

        public static void generateEmailFromName(String fullName, String domain, String emailExt) {
            String email = fullName.substring(0, fullName.indexOf(" ")).toLowerCase() + "@" + domain.toLowerCase() + "." +
                    emailExt.toLowerCase();

            System.out.println(email);


        }
         public static void main(String [] args) {
            generateEmail("Frank","Gmail");

        }





    }

