package InterView_programs;

public class FibonacciSeries {
    public static void fibonacci(int n) {
        int a = 0, b = 1, c, i;
        System.out.print(a + " " + b + " ");
        for (i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
