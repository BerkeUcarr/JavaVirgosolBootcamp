package JavaDay2;

public class IfPractice3 {

    public static void main(String[] args) {

        int kenar1 = 10;
        int kenar2 = 15;
        int kenar3 = 10;

        if (kenar1 == kenar2 && kenar1 == kenar3){
            System.out.println("Eşkenar Üçgen");
        } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çeşitkenar Üçgen");
        }
    }
}
