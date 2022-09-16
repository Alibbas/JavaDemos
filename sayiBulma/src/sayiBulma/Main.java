package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int [] sayilar = new int[] {2,5,2,7,1,7,7};
		int aranacakSayi = 5;
		boolean varMi = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacakSayi) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayý dizinin içinde vardýr.");
		}
		else {
			System.out.println("Sayý dizinin içinde yoktur.");
		}
	}

}
