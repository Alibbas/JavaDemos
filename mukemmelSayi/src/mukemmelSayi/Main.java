package mukemmelSayi;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int tmp = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				tmp += i;
			}
		}
		if (number == tmp) {
			System.out.println("M�kemmel say�d�r.");
		}else {
			System.out.println("M�kemmel say� de�ildir.");
		}
	}

}
