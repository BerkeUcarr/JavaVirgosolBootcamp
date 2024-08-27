package JavaDay1;

public class Casting {

    public static void main(String[] args) {

        // double > float > long > int > short > byte
        int a = 100;
        short b = (short) a; // int > short olduğu için casting olması gerekir.
        long c = a; // long > int olduğu için direkt atama yapılır.

        double d = 2313.93;
        int e = (int) d;
        System.out.println(e);
    }
}
