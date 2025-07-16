public class recursion7 {
    public static void main(String[] args) {
        int n = 123;
        int result = sumofdigits(n);
        System.out.println("the sum of digits " +n+ " is: " +result);
    }
    public static int sumofdigits(int n) {
        if(n==0){
            return 0;
        }
        return (n%10)+ sumofdigits(n/10);
    }
}
