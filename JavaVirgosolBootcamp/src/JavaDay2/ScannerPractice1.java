package JavaDay2;

import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi1);

        scanner.nextLine();
        System.out.println("Bir cümle giriniz: ");
        String string1 = scanner.nextLine();
        System.out.println("Girdiğiniz cümle: " +string1);

        scanner.close();
    }
}
