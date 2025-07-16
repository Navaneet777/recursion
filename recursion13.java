public class recursion13 {
    // Recursive method to calculate sum of squares
    public static int sumOfSquares(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive step
        return (n * n) + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;  // You can change this to any value
        int result = sumOfSquares(N);

        System.out.println("Sum of squares of first " + N + " natural numbers is: " + result);
    }
}


