package JavaDay6.CarClassPractice;

public class Mercedes extends Car{

    public String color;

    public Mercedes(String brand, int model, int volume, String color) {
        super(brand, model, volume); // car'ın içerisi default cons. göndermek zorunda
        this.color = color;
    }

    public boolean isLuxury(){
        return true;
    }

    public void brake(){
        System.out.println("Maksimum fren sistemi kullanıldı. ");
    }
}
