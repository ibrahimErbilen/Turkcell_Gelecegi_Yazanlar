import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("1.Sayıyı giriniz : ");
			int x = scan.nextInt();
			System.out.print("2.Sayıyı giriniz : ");
			int y = scan.nextInt();
			int sonuc = x/ y;
			System.out.println("Sonuç : " + sonuc);
		} catch (ArithmeticException exception) {
			System.out.println(exception.getLocalizedMessage());//alınan hatanınuygulamanın çalışan işletim sistemi dilinde vermekte
			System.out.println(exception.getMessage());// direk ingilizce olarak hatayı bize vermekte
			exception.printStackTrace();// uygulamada hata ile karşılaşılan metotları bize bildirir
			System.out.println("İşlemsel hata ile karşılandı");
		}catch (InputMismatchException exception){
			System.out.println("Lütfen bir sayı giriniz");
		}finally {
			scan.close();
			System.out.println("Finally");
		}
		System.out.println("Uygulama kapandı");
		
	}
}
