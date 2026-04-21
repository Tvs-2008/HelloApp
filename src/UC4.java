public class UC4 {
    public static void main(String[] args) {
        // Check if arguments are provided
        String greeting;
        
        if (args.length > 0) {
            // Join all names with commas
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            // Default to "World"
            greeting = "Hello, World!";
        }
        
        // Display greeting
        System.out.println(greeting);
    }
}