package JavaDay6.CarClassPractice;

public class Car {

    public String brand;
    public int model;
    public int volume;

    public Car(String brand, int model, int volume){
        this.brand = brand;
        this.model = model;
        this.volume = volume;
    }

    public void start() {
        System.out.println("Start yapıldı. ");
    }
    public void stop(){
        System.out.println("Stop yapıldı. ");
    }
    public void brake(){
        System.out.println("Fren yapıldı. ");
    }
}
