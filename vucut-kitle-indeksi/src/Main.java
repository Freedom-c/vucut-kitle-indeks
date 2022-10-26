import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int kilo;
		double boy, indeks;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Kilonuzu girin:");
		kilo= inp.nextInt();
		System.out.println("Boyunuzu girin (m): ");
		boy= inp.nextDouble();
		
		indeks= kilo/(boy*boy);
		
		System.out.println("İndeks değeriniz: "+ indeks);
		
	}

}
