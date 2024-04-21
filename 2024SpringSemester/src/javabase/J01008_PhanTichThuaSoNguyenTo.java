package javabase;
import java.util.ArrayList;
import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Tính tổng các ước số nguyên tố
        long sum = 0;
        ArrayList<Integer> primes = generatePrimes();
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            sum += primeFactorsSum(number, primes);
        }

        System.out.println(sum);
        scanner.close();
    }

    // Hàm sinh danh sách các số nguyên tố nhỏ hơn hoặc bằng giới hạn trên
    public static ArrayList<Integer> generatePrimes() {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isComposite = new boolean[2000001];
        for (int i = 2; i <= 2000000; i++) {
            if (!isComposite[i]) {
                primes.add(i);
                for (int j = i * 2; j <= 2000000; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        return primes;
    }

    // Hàm tính tổng các ước số nguyên tố của một số nguyên
    public static long primeFactorsSum(int n, ArrayList<Integer> primes) {
        long sum = 0;
        for (int prime : primes) {
            if (prime * prime > n) break;
            while (n % prime == 0) {
                sum += prime;
                n /= prime;
            }
        }
        if (n > 1) {
            sum += n;
        }
        return sum;
    }
}