package JavaDay5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,2,4,1,2,4,0,7,5,9));

        System.out.println(Collections.max(numbers));

        for (int i = 0; i < 3; i++) { // 3 tane en büyük sayıyı sildirme
            numbers.removeIf(p -> p==Collections.max(numbers));
        }
        System.out.println(numbers);
    }
}
