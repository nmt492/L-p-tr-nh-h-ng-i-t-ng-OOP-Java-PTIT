package javabase;

import java.util.Scanner;

public class J01018_SoKhongLienKe {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		input.nextLine();
		while(t-->0) {
			String n = input.nextLine();
			if(soKhongLienKe(n) && tongChuSo10(n)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	private static boolean soKhongLienKe(String n) {
		for (int i = 0; i < n.length() - 1; i++) {
            int digit1 = Character.getNumericValue(n.charAt(i));
            int digit2 = Character.getNumericValue(n.charAt(i + 1));
            
            if (Math.abs(digit1 - digit2) != 2) {
                return false;
            }
        }
        return true;
	}
	private static boolean tongChuSo10(String n) {

        int s = 0;
		for (int i = 0; i < n.length(); i++) {
            int a = Character.getNumericValue(n.charAt(i));
            s = s + a;  
        }
		if (s % 10 != 0) {
            return false;
        }
        return true;
	}
}
