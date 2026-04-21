public class UC7 {
    public static void main(String[] args) {
        String greeting;

        // Check if arguments are provided
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            // Join all arguments with a comma and space
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        }

        // Print the final greeting
        System.out.println(greeting);
    }
}