package day35_Inheritance.Person;

//Super class -- Parent Class -- Base Class
public class Person {

    // instance variable/ fields can inherit
    String name;
    int age;
    String favoriteHobby;

    // instance methods/ actions can inherit
    public void talk () {
        System.out.println(name + " is talking");
    }

}