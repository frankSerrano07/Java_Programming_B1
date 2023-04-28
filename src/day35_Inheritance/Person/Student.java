package day35_Inheritance.Person;


// Subclass -- Child Class
// Student is-a Person.
public class Student extends Person {


    int funLevel;


    public void study () {
        System.out.println(name + " is studying");
    }

}