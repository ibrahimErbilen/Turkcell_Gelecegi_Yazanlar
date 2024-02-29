import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		int i = 0;
//		do {
//			System.out.println(i++);
//		} while (i < 10);
		
		String passworld = null;
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.print("Parola:");
			passworld= scanner.nextLine();
			
		} while (!passworld.equals("123"));
		System.out.println("Hoş geldiniz ");

	}

}
