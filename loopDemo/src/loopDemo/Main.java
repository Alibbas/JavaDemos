package loopDemo;


public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For D�ng�s� bitti.");
		
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("While D�ng�s� bitti.");
		
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		System.out.println("Do-While D�ng�s� bitti.");
	}

}
