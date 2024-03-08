import java.util.Scanner;

public class Driver {
	
	
	
	public static void main(String[] args) {
		
		nullPointerExcep();
	}
	public static void nullPointerExcep() {
		Scanner scanner = null;
		String line = scanner.nextLine();
		System.out.println(line);
	}
	
	public static void arrayExcep() {
		int[] numbers = {0,1,2,3,4};
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		System.out.println(numbers[index]);
	}
	
	
	public static void arithExcep() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println( x / y);
	}
}
