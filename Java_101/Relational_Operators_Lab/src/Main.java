import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean sonuc = 9 > 5 ;
		System.out.println(sonuc);
		
		boolean sonuc2 = 9 < 5;
		System.out.println(sonuc2);
		
		boolean sonuc3 = 9 >= 5 ;
		System.out.println(sonuc3);
		
		boolean sonuc4 = 9 <= 5;
		System.out.println(sonuc4);
		
		boolean sonuc5 = 9 == 5;
		System.out.println(sonuc5);
		
		boolean sonuc6 = 9 != 5;
		System.out.println(sonuc6);
		
		Scanner scanner = new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		
		System.out.println(str1.equals(str2));
		
	}

}
