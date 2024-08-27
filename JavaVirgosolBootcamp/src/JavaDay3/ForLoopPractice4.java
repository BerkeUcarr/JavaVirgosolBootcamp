package JavaDay3;

import java.util.Scanner;

public class ForLoopPractice4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str;
        String reversedStr = "";

        System.out.println("Bir metin giriniz ");
        str = scanner.nextLine();

        System.out.println();

        for (int i = str.length() - 1; i > -1; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        System.out.println();

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println("Metnin tersi ve düzü eşittir.");
        } else {
            System.out.println("Metnin tersi ve düzü eşit değildir.");
        }
    }
}