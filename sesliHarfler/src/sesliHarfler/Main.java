package sesliHarfler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char harf = sc.next().charAt(0);
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf.");
			break;
		default:
			System.out.println("�nce sesli harf.");
		}

	}

}
