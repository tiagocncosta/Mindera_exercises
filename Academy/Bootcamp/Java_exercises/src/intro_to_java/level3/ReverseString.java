package intro_to_java.level3;

public class ReverseString {

    public static void main(String[] args) {
        String reversed = reverse("message to you");// should return "uoy ot egassem"
        System.out.println(reversed);
    }

    // Implement a method that receives a String and returns the same String reversed
    // NOTE: method is returning null because it has to return something and null is the default type of String
    private static String reverse(String strToReverse) {
        String reverseMessage = "";
        for (int i = strToReverse.length()-1; i >= 0; i--) {
            char a = strToReverse.charAt(i);
            reverseMessage += a;
        }
        return reverseMessage;
    }
}
