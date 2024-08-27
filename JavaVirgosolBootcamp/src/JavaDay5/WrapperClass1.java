package JavaDay5;

public class WrapperClass1 {

    public static void main(String[] args) {
        int number1 = 123;
        Integer number2 = number1;

        int number3 = number2;

        byte b1 = 23;
        Byte b2 = b1;
        char char1 = 'A';
        Character char2 = char1;

        int[] numbers1 = {1,5,32,2,4,3};
        Integer[] numbers2 = {2,4};

        System.out.println(number3);
    }
}
