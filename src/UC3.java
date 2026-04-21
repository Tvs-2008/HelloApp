public class UC3 {
    public static void main(String[] args) {
        // Use ternary operator for default handling
        String name = (args.length > 0) ? args[0] : "World";
        
        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}