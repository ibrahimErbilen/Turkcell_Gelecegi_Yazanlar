import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,5,6,7,8,9};
//		
//		for (int i : numbers) {
//			System.out.println(i);
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 Adet Sayı giriniz : ");
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		Array.getShort(numbers, 10);
		
		for (int i : numbers) {
			System.out.print(i);
		}

	}

}
