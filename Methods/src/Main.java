import java.util.Scanner;

public class Main {
	
	// Public : Her yerden erişilebilir
	// Private : Sadece o sınıf içerisinden erişilebilir
	// değer döndüren methodlarda return olmak zorundadır

	public static void main(String[] args) {
		
		/*
		 * Visibility methoda kimlerin erişilebileceğini ifade eder
		 * 
		 * 
		 * */
		
		System.out.println("Hello World");
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(16));
		
		Scanner scanner = new  Scanner(System.in);
		String nextLine = scanner.nextLine();
		System.out.println(nextLine.toUpperCase());
	}

}
