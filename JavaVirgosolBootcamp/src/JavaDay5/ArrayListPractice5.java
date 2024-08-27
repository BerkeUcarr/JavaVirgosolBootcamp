package JavaDay5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice5 {

    public static void main(String[] args) {

        // String için
        String[] dizi = {"ahmet", "mehmet", "deniz"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(dizi)); //diziyi arraylist'e çevirme ekleme-çıkarma için
        list.add("ayşe");
        System.out.println(list);
        Collections.sort(list); // alfabetik sıralama yapar
        System.out.println(list);
        Collections.reverse(list); // tersten alfabetik sıralama yapar
        System.out.println(list);

        // Integer için
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,2,4,1,2,4,0,7,5,9));
        System.out.println(numbers);
        Collections.sort(numbers); // küçükten büyüğe sıralar
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

    }
}
