import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		while (true) {
			System.out.println(new Date());
			Thread.sleep(1000);
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Kelime giriniz : ");
			String text = scanner.nextLine();
			System.out.println(text.toUpperCase());
			
			int i = scanner.nextInt();
			System.out.println(Math.pow(i, 2));
			break;
			
		}
	}

}
