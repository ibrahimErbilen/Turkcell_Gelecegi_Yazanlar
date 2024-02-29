import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Haftanın günü : ");
		int gun = scanner.nextInt();
		
		switch (gun) {
		case 1,2,3,4,5: {
			System.out.println("Hafta içi");
			break;
		}case 6,7: {
			System.out.println("Hafta sonu");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + gun);
		}

	}

}
