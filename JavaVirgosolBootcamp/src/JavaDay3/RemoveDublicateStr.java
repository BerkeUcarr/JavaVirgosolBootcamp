package JavaDay3;

public class RemoveDublicateStr {

    public static void main(String[] args) {

        String str = "aaaabbbbbbbbbcc"; // abc olması gerekiyor.

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
