package arkadasSayiler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz.");
		int number1 = sc.nextInt();
		System.out.println("�kinci say�y� giriniz.");
		int number2 = sc.nextInt();
		int toplamBir = 0;
		int toplamIki = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				toplamBir += i;
			}
		}

		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				toplamIki += j;
			}
		}
		
		if (number1 == toplamIki && number2 == toplamBir) {
			System.out.println("Bu iki say� arkada� say�d�r.");
		}
		else {
			System.out.println("Bu iki say� arkada� de�ildir.");
		}

	}

}
