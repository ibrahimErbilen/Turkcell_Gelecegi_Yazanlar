import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4};
		Scanner scan = new Scanner(System.in);
		System.out.print("Index değerini giriniz : ");
		int index = scan.nextInt();
		
		if (index <= numbers.length) {
			System.out.println(numbers[index]);
		}else {
			System.out.println("Yanlış index numaras");
		}
		
		
		/*try {
			System.out.println(numbers[index]);
		} catch (Exception e) {
			System.out.println("Yanlış index numarası");
		}finally {
			scan.close();
		}*/
		
	}
}
