// Class to print Fibonacci series
class Print {

    int fibonacciSeries(int n) {
        if (n == 0) {
            return 0;  // 0th Fibonacci is 0
        } else if (n == 1) {
            return 1;  // 1st Fibonacci is 1
        } else {
            // Recurrence Relation: F(n) = F(n-1) + F(n-2)
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        }
    }
}

public class FibonacciSeries {
    public static void main(String[] args) {

        Print obj = new Print();

        int terms = 10; // Print first 10 Fibonacci numbers

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            System.out.print(obj.fibonacciSeries(i) + " ");
        }
    }
}
