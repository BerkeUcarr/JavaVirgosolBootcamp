package JavaDay3;

public class ForLoopPractice5 {

    public static void main(String[] args) {

          String str = "deneme";
          String reverseStr = "";

        for (int i = str.length()-1; i > -1 ; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println(reverseStr);

        if (str.equalsIgnoreCase(reverseStr)){ // palindrome örneği
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
