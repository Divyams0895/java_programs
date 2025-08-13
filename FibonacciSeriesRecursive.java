import java.util.Scanner;

public class FibonacciSeriesRecursive {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        FibonacciSeriesRecursive fib = new FibonacciSeriesRecursive();
        for (int i = 0; i < terms; i++) {
            System.out.print(fib.fibonacci(i) + " ");
        }

        sc.close();
    }
}
