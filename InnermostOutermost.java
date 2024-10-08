public class InnermostOutermost {

    public static int factorial(int n) {
        System.out.println("Entering factorial with n = " + n);

        if (n <= 1) {
            System.out.println("Base case reached with n = " + n);
            return 1;
        }

        int result = n * factorial(n - 1);
        System.out.println("Evaluating factorial(" + n + ") = " + result);
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}