package intro_to_java.level2;

public class CharacterSwitcher {
    public static void main(String[] args) {
        String result = switchCharacters("TIAGO"); // should return "eantaloupc"
        System.out.println(result);
    }

    // Implement a method that receives a string and switches the first and last characters of said string
    private static String switchCharacters(String str) {
        String a = str.substring(0,1);
        String b = str.substring(str.length()-1, str.length());
        String c =str.substring(1, str.length()-1);

        return  b + c + a;

    }
}
