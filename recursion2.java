public class recursion2 {
    public static void main(String[] args) {
        int N = 5; // You can change this value
        printNumbers(N); // Call the recursive method
    }

    // Recursive method to print numbers from N to 1
    public static void printNumbers(int n) {
        // Base case: stop when n is less than 1
        if (n < 1) {
            return;
        }

        // Print current number
        System.out.println(n);

        // Recursive call with (n - 1)
        printNumbers(n - 1);
    }

  
}

    
