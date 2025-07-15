public class recursion1 {
    
    public static void main(String[] args) {
        int N = 10; // Number of times to print the message
        printMessage(N); // Call the recursive method
    }

    // Recursive method to print the message
    public static void printMessage(int n) {
        // Base condition to stop recursion
        if (n == 0) {
            return; // Stop when n becomes 0
        }

        // Print the message
        System.out.println("Hello my dear");

        // Recursive call with n - 1
        printMessage(n - 1);
    }
}

   
