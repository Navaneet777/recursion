public class recursion11 {
    public static void main(String[] args) {
        int N = 5;
        long result = product(N);

        System.out.println("Product of first " + N + " natural numbers is: " + result);
    }

    // Recursive method to calculate product (factorial)
    public static long product(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive step
        return n * product(n - 1);
    }
}
