package JavaDay3;

public class DoWhilePractice2 {

    public static void main(String[] args) {

        String str = "deneme";
        int index = -1;

        do {
            index++;
            char karakter = str.charAt(index);
            if (karakter == 'a' || karakter == 'e') continue; // continue koymazsak sadece bu harfleri yazdırırız.
            System.out.println(karakter);

        } while (index < str.length()-1);
    }
}
