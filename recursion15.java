public class recursion15 {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;          // Get last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            number = number / 10;             // Remove last digit
        }

        // Check if original and reversed are same
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 12321;  // Change this to test other numbers

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}


