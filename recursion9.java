public class recursion9 {
      public static void main(String[] args) {
        int N = 20; // You can change this to any number ≥ 2
        System.out.println("Even numbers from 2 to " + N + ":");

        printEven(2, N); // Start printing from 2
      }


    // Recursive method to print even numbers from 2 to N
    public static void printEven(int current, int N) {
        // Base case: stop when current > N
        if (current > N) {
            return;
        }

        // Print the current even number
        System.out.println(current);

        // Recursive call: move to the next even number
        printEven(current + 2, N);
    }

}
