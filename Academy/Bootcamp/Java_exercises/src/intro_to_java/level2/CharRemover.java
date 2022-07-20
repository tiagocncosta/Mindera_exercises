package intro_to_java.level2;

public class CharRemover {

    public static void main(String[] args) {
        String result = removeChar("lullaby", 0); // should return lllaby
        System.out.println(result);
    }

    // Implement a method that removes the character in a given index from a given String
    private static String removeChar(String str, int charIndex) {
        String a= str.substring(0, charIndex);
        String b = str.substring(charIndex+1 , str.length());

        return a + b;
    }
}
