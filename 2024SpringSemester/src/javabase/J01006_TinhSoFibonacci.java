package javabase;
import java.util.Scanner;
public class J01006_TinhSoFibonacci {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt(); // Số lượng bộ test

	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt(); // Số Fibonacci thứ n
	            long fib = fibonacci(n); // Tính số Fibonacci thứ n
	            System.out.println(fib); // In ra kết quả
	        }

	        scanner.close();
	    }
	    
	    // Phương thức tính số Fibonacci thứ n
	    public static long fibonacci(int n) {
	        if (n <= 2) {
	            return 1;
	        }

	        long fib1 = 1;
	        long fib2 = 1;
	        long fib = 0;
	        
	        for (int i = 3; i <= n; i++) {
	            fib = fib1 + fib2;
	            fib1 = fib2;
	            fib2 = fib;
	        }
	        
	        return fib;
	    }

}
