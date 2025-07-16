public class recursion6 {
    
    public static void main(String[] args) {
        int N = 5; 
        int result = sum(N); // Call the recursive method
        System.out.println("Sum of first " + N + " natural numbers is: " + result);
    }
    public static int sum(int n) {
        // Base case: when n is 0, return 0
        if (n == 0) {
            return 0;
        }

        // Recursive call: add current number and call sum(n - 1)
        return n + sum(n - 1);
    }
}

