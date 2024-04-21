package javabase;
import java.util.Scanner;

public class J01007_CheckFibonacci {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt(); // Số lượng bộ test
	        
	        for (int i = 0; i < t; i++) {
	            long n = scanner.nextLong(); // Số nguyên dương n
	            if (isFibonacci(n)) {
	                System.out.println("YES");
	            } else {
	                System.out.println("NO");
	            }
	        }

	        scanner.close();
	    }

	    // Hàm kiểm tra xem một số có phải là số Fibonacci hay không
	    public static boolean isFibonacci(long n) {
	        if (n == 0 || n == 1) {
	            return true;
	        }

	        long fib1 = 1;
	        long fib2 = 1;
	        long fib = fib1 + fib2;

	        while (fib <= n) {
	            if (fib == n) {
	                return true;
	            }
	            fib1 = fib2;
	            fib2 = fib;
	            fib = fib1 + fib2;
	        }

	        return false;
	    }
}
