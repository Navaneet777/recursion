public class recursion3 {
     public static void main(String[] args) {
        int N = 5; 
        printNumbers(1, N); // Start from 1 up to N
    }
   

    // Recursive method to print numbers from 1 to N
    public static void printNumbers(int current, int n) {
        // Base case: stop when current is greater than n
        if (current > n) {
            return;
        }

        // Print current number
        System.out.println(current);

        // Recursive call to print the next number
        printNumbers(current + 1, n);
    }
}


