package JavaDay5;

public class WrapperClass2 {

    public static void main(String[] args) {
        String str = "123";

        int num1= Integer.parseInt(str);
        System.out.println((num1 + 27));

        double num2 = Double.parseDouble(str);
        Double num3 = Double.valueOf(str);
        System.out.println(num3 + 12313.21);
        System.out.println(num2 + 33.3);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        char ch = '7';
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isLetterOrDigit(ch));

        String str2 = "isafdi123";
        char [] chars = str2.toCharArray();

        for (char each : chars) {
            System.out.println(each);
        }
    }
}
