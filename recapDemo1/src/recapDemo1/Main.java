package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 266;
		int sayi2 = 25;
		int sayi3 = 3;
		
		int tmp = sayi1 ;
		
		if(tmp<sayi2) {
			tmp = sayi2;
		}
		
		if (tmp<sayi3) {
			tmp = sayi3;
		}
		
		System.out.println("En büyük eþittir: "+tmp);
	}

}
