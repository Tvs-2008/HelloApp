public class UC5 {
    public static void main(String[] args) {
        // Step 1: Check for zero arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Step 2: Initialize StringBuilder for efficient concatenation
            StringBuilder names = new StringBuilder();

            // Step 3: Enhanced For Loop (For-Each)
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", "); // Add comma before subsequent names
                }
                names.append(name);
            }

            // Step 4: Print the final formatted greeting
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}