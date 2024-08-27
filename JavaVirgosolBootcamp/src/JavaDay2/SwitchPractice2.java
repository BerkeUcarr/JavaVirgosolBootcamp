package JavaDay2;

public class SwitchPractice2 {

    public static void main(String[] args) {

        int not = 1;

        switch (not){
            case 1:
                System.out.println("Kaldı");
                break;
            case 2:
                System.out.println("Geçer");
                break;
            case 3:
                System.out.println("Orta");
                break;
            case 4:
                System.out.println("İyi");
                break;
            case 5:
                System.out.println("Pek İyi");
                break;
            default:
                System.out.println("Lütfen geçerli bir not giriniz...");
        }
    }
}
