package JavaDay6;

public class Person {

    public String firstName;
    public String lastName;
    public int age;
    public char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(){
        firstName = "Mehmet";
        lastName = "Kutlu";
        age = 26;
        gender = 'E';
    }
}
