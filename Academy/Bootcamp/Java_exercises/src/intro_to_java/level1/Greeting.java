package intro_to_java.level1;

public class Greeting {

    public static void main(String[] args) {
        greeting("Delilah");// greeting("Delilah"); // Shoud return "Hello, Delilah"
        greeting("Francis");// greeting("Francis"); // Shoud return "Hello, Francis!"
    }

    // You should implement a method that receives a name and returns a greeting message with said name included
    // NOTE: You might have to change the method declaration itself
    private static void greeting(String name) {
        System.out.printf("Hello, %s.%n", name);
    }
}
