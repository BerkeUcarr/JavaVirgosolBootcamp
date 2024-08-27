package JavaDay6.CarClassPractice;

public class CarObjectPractice {



    public static void main(String[] args) {

        Mercedes obj1 = new Mercedes("Mercedes", 2020, 4, "Red");
        System.out.println(obj1.brand);
        obj1.start();
        obj1.brake(); // mercedes'in içindekini override etti



       /*Car car = new Car("Mercedes",2000, 4);
        System.out.println(car.brand);
        car.start(); */
    }
}
