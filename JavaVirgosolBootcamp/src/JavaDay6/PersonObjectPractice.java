package JavaDay6;

public class PersonObjectPractice {

    public static void main(String[] args) {

        Person person1 = new Person("Ahmet", "Mutlu", 18, 'E');
        System.out.println(person1.age);

        Person person2 = new Person();
        System.out.println(person2.firstName);
        System.out.println(person1); //@Override toString() method
        System.out.println(person1.age);

    }

}
