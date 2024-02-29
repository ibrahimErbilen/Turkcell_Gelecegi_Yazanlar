import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int starCount = scanner.nextInt();
//		
//		int i = 1;
//		
//		while(i <= starCount) {
//			int j = 0;
//			while(j<i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		long total = 0;
		while(true) {
			int x = scanner.nextInt();
			if(x==0) {
				break;
			}
			total+=x;
		}
		System.out.println(total);

	}

}
