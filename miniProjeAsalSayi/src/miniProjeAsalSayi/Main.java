package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Say� giriniz.");
		int number = s.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number%i == 0) {
				isPrime = false;
			}
	}
		if (isPrime==true) {
			System.out.println("Say�m�z asald�r.");
		}else {
			System.out.println("Say�m�z asal de�ildir.");
		}
}
	
}
