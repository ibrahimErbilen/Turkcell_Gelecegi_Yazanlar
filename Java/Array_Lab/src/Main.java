import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0]= 5;
		numbers[1]= 10;
		numbers[2]= 20;
		numbers[3]= 30;
		numbers[4]= 40;
		
		System.out.println(numbers.length);//dizinin boyutunu verir
		System.out.println(Arrays.toString(numbers));//tek boyutlu dizilerde ekrana çıktısını veriri
		
		
		//Arrayleri farklı bir şekilde yazdırma
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dizi uzunluğu : ");
		int length = scanner.nextInt();
		int[] numbers1 = new int[length];
		
		for (int i = 0; i < numbers1.length; i++) {
			System.out.print(i+1 + ".Sayı : ");
			numbers1[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(numbers1));
		
		int total = 0 ;
		
		
		for (int i = 0; i < numbers1.length; i++) {
			total+=numbers1[i];
		}
		
		int averge = total/numbers1.length;
		
		System.out.println("Girilen sayıların toplamı : "  + total);
		System.out.println("Girilen sayıların ortalaması : " + averge);
	}

}
