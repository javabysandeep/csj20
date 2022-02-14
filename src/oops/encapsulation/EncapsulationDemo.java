package oops.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Person person = new Person();
        person.setPersonId(101);
        person.setPersonName("vaishnav");

        System.out.println(person.getPersonId());
        System.out.println(person.getPersonName());
    }
}
