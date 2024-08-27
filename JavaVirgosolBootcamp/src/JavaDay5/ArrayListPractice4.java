package JavaDay5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice4 {

    public static void main(String[] args) {

        // String için
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW" , "BYD" , "BYD" , "BYD" , "Opel"));
        System.out.println(cars);

        cars.removeIf(p -> p.equals("BYD"));
        System.out.println(cars);

        // Integer için
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3, 13, 3, 256, 24, 14, 3));
        System.out.println(numbers);

        numbers.removeIf(p -> p==3);
        System.out.println(numbers);
    }
}
