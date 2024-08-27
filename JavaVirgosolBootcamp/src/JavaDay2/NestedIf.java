package JavaDay2;

public class NestedIf {

    public static void main(String[] args) {

        int sayi1 = 12;
        int sayi2 = 15;
        int sayi3 = 18;

        if (sayi1 >= sayi2){
            if (sayi1 >= sayi3){
                System.out.println("En büyük sayı: " + sayi1);
            } else {
                System.out.println("En büyük sayı: " + sayi3);
            }
        } else if (sayi2 >= sayi3) {
            System.out.println("En büyük sayı: " + sayi2);
        } else {
            System.out.println("En büyük sayı: " + sayi3);
        }
    }
}
