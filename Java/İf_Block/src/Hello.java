import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int number = 75;
		
		if (number < 100) {
			System.out.println("sayın 100 den küçük");
			if (number > 50) {
				System.out.println("Sayı 50 den büyüktür");
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int num = scanner.nextInt();
		
		if (num < 100 && num >=10) {
			System.out.println("Girdiğiniz sayı iki basamaklı");
		}else if (num < 1000 && num >= 100) {
			System.out.println("Girdiğiniz sayı 3 basamaklıdır");
		}else if (num < 10000 && num >= 1000) {
			System.out.println("Girdiğiniz sayı 4 basamaklıdır");
		}else {
			System.out.println("Girdiğiniz sayı 1 ve  9999 arasında değil");
		}

	}

}
