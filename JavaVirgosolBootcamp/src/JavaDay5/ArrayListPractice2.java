package JavaDay5;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Renault"); //ArrayList'e eleman ekleme
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Fiat");
        cars.add("Ferrari");
        cars.add("Ford");

        System.out.println(cars);

        cars.set(1, "Opel");
        System.out.println(cars);

        // cars.remove("Renault"); // object için
        cars.remove(0); // index için
        System.out.println(cars);

        boolean isRemoved = cars.remove("Opel"); // object ile eleman siliyor
        System.out.println(cars);
        System.out.println("isRemoved: " + isRemoved); //silindi mi true false dönüyor

        String removedElement = cars.remove(2); // index ile eleman siliyor
        System.out.println(cars);
        System.out.println(removedElement); // silinen elemanı yazdırıyor
    }
}
