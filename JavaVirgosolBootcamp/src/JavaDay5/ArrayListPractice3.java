package JavaDay5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Renault"); //ArrayList'e eleman ekleme
        cars.add("BMW");
        cars.add("Mercedes");
        cars.addAll(Arrays.asList("Fiat" , "Ferrari" , "Ford")); // Birden fazla ekleme yaparken kullanılır.

        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // cars.clear(); // bütün elemanları siliyor
        // System.out.println(cars);

        ArrayList<String> cars2 = new ArrayList<>(); //ikinci bir liste oluşturuyoruz
        cars2.add("Renault"); //ArrayList'e eleman ekleme
        cars2.add("BMW");
        cars2.add("Mercedes");
        cars.removeAll(cars2); // ikinci bir liste oluşturup birinci listede silmek istediklerimizi ekliyoruz.
        System.out.println(cars);

        // boolean isContains = cars.containsAll(Arrays.asList("Bugatti" , "BMW"); // içerip içermediğini karşılaştırır
        // System.out.println(isContains); // içeriyorsa true döndürür

        System.out.println(cars.indexOf("Ford"));
    }
}
