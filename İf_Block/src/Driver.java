import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int number  = scanner.nextInt();
		if (number > 0) {
			System.out.println("Pozitif bir sayı girdiniz");
		}else if (number == 0) {
			System.out.println("0 Rakamını girdiniz");
		}else {
			System.out.println("Negatif bir sayı girdiniz");
		}
		
	}
}
