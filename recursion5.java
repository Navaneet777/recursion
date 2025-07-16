public class recursion5 {
    
    public static void main(String[] args) {
        int n = 6; 
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

  
