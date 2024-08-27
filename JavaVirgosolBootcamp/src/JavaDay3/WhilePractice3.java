package JavaDay3;

import java.util.Scanner;

public class WhilePractice3 {

    public static void main(String[] args) {

        /*int sayi1 = 1;
        int sonuc1 = 0;
        while (true){
            sonuc1 = sonuc1 + sayi1;
            sayi += 2;
            System.out.println(sonuc1);
            if (sayi1 >= 10){
                break;
            }
        }*/

        Scanner scanner = new Scanner(System.in);
        int sonuc = 0;

        while (true) {
            System.out.println("Sayı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi == 0) break;
            sonuc = sonuc + sayi;
        }
        System.out.println("Girilen tüm sayıların toplamı: " + sonuc);
        scanner.close();
    }
}
