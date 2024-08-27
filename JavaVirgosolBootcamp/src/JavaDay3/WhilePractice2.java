package JavaDay3;

public class WhilePractice2 {

    public static void main(String[] args) {

        int sayi = 1;
        int sonuc = 0;
        while (sayi < 10){
            sonuc = sonuc + sayi;
            System.out.println("Adım " + sayi + ": " + sonuc);
            sayi++;
        }

    }
}
