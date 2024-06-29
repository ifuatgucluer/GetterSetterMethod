package org.example;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setters
        person.setName("John Seza");
        person.setAge(25);

        // Getting values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying to set a negative age
        person.setAge(-5);
    }
}
