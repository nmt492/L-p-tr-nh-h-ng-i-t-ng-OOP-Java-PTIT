package javabase;

import java.util.Scanner;

public class J01014_UocSoNguyenToLonNhat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-->0) {
			int n = input.nextInt();
			System.out.println(uocSoNguyenToMax(n));
		}
	}
	
	private static int uocSoNguyenToMax(int n) {
		int a = (int) Math.sqrt(n);
		for (int i = a; i > 0; i--) {
			if (n % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return 1;
	}
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
