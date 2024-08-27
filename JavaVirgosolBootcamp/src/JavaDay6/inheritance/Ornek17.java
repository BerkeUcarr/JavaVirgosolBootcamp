package JavaDay6.inheritance;

class Hayvan{
    // Hayvan sınıfının özelliği
    public boolean isLive = true;
    String tur = "Hayvan";

    // Hayvan sınıfının metodu
    public void sesCikar() {
        System.out.println("Hayvan ses çıkarır ");
    }
}

class Kedi extends Hayvan{ // Hangi class'tan extends edilecekse onu yazıyoruz
    // Kedi sınıfının özelliği
    public String tur = "Kedi";

    // Kedi sınıfının sesCikar metodunu override etmesi
    public void sesCikar() {
        System.out.println("Miyav");
    }
}
// Classları çağırdığımız yer
public class Ornek17  {

    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        System.out.println(hayvan.tur); //
        hayvan.sesCikar(); // hayvan ses çıkarır

        Kedi kedi = new Kedi();
        System.out.println("Hayvan canlı mı? " + kedi.isLive); // true
        System.out.println(kedi.tur); // kedi
        kedi.sesCikar(); //miyav

//        Kedi kedi = new Kedi();
//        kedi.sesCikar(); // miyav
//        System.out.println(kedi.tur); // kedi
//
//        Hayvan hayvan = new Kedi();
//        hayvan.sesCikar(); // miyav
//        System.out.println(hayvan.tur); // hayvan
    }
}
