package javabase;

import java.util.Scanner;

public class J01017_SoLienKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới
        
        for (int i = 0; i < numTests; i++) {
            String number = scanner.nextLine();
            String result = checkProperty(number);
            System.out.println(result);
        }
    }
    
    public static String checkProperty(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            int digit1 = Character.getNumericValue(number.charAt(i));
            int digit2 = Character.getNumericValue(number.charAt(i + 1));
            
            if (Math.abs(digit1 - digit2) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
}

