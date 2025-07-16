public class recursion12 {

    public static void printArray(int[] arr, int index) {
        // Base case--- if index reaches the length of array, stop recursion
        if (index == arr.length) {
            return;
        }

        // Print current element
        System.out.println(arr[index]);

        // Recursive call for the next index
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 

        System.out.println("Array elements:");
        printArray(numbers, 0); // Start from index 0
    }
}
