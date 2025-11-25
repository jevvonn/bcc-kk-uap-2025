package Encapsulation;

public class ExampleEncapsulation {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Alice";
        person.setAge(30);
        person.address = "123 Main St";
        person.phoneNumber = "555-1234";

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.address);
        System.out.println("Phone Number: " + person.phoneNumber);
    }
}
