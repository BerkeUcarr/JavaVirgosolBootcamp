package JavaDay5;

import java.util.Arrays;

public class SplitMethod {

    public static void main(String[] args) {

        String str = "Ayşe tatile çıktı";
        String[] dizi = str.split(" "); // tırnak içerisindeki ögeden ayırır. Boşluk / virgül vs
        System.out.println(Arrays.toString(dizi)); // yazdırmak için gerekiyor
    }
}
