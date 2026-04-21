public class UC6 {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Step 2: Use enhanced for loop to append each name and delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Step 3: Remove the trailing ", " using substring
            // Check length to ensure safe manipulation
            String finalNames = "";
            if (nameBuilder.length() > 0) {
                finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // Step 4: Print the final formatted greeting
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}