package day33B_Encaptulation_AccessModifierTest;

public class AccessInPackage {


        public static void main(String[] args) {
            AccessModifiers obj = new AccessModifiers();
            System.out.println(obj.a);
            System.out.println(obj.b);
            //System.out.println(obj.c); // Since it is a different class and private is not accessible outside of the class.

            // System.out.println(AccessModifiers.z); // Since it is a different class and private is not accessible outside of the class.
            System.out.println(AccessModifiers.y);


        }

    }



