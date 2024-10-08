public class Fibonacci {

    public static int fibo(int n) {
        if (n < 0 || n > 45) {
            throw new IllegalArgumentException("n should be between 0 and 45");
        }
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int[] f = new int[n + 1]; 
        f[0] = 0;
        f[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2]; 
        }
        
        return f[n]; 
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 45; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibo(i));
        }
    }
}

