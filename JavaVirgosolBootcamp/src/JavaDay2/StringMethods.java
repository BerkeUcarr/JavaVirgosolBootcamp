package JavaDay2;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('W'));
        System.out.println(str.indexOf("Wor"));
        System.out.println(str.lastIndexOf('o'));
        System.out.println(str.substring(3 , 8)); // ilki (3) dahil sonuncu (8) dahil değil
        System.out.println(str.equals("Hello World"));
        System.out.println(str.equalsIgnoreCase("hello world"));
        System.out.println(str.replace("o", "1" ));
        System.out.println(" deneme ".trim());
        System.out.println(str.charAt(4));
        System.out.println(" ".isBlank());
        System.out.println("".isEmpty());
        System.out.println(str.endsWith("ld"));
        System.out.println(str.startsWith("Hel"));
        System.out.println(str.contains("llo"));
    }
}
