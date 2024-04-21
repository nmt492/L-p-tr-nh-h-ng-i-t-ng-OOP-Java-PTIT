package javabase;
import java.util.Scanner;
public class J01013_TongUocSoNguyenTo {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();

	        for (int i = 0; i < t; i++) {
	            int testCase = i + 1;
	            int n = scanner.nextInt(); 
	            System.out.print("Test " + testCase + ": ");
	            primeFactorization(n);
	            System.out.println();
	        }

	        scanner.close();
	    }

	    
	    public static void primeFactorization(int n) {
	        for (int i = 2; i <= n; i++) {
	            int count = 0;
	            while (n % i == 0) {
	                count++;
	                n /= i;
	            }
	            if (count > 0) {
	                System.out.print(i + "(" + count + ") ");
	            }
	        }
	    }
	
}
