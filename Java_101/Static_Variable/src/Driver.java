
import static java.lang.Math.PI;//Bu şekilde yaptığımızda sınıfın isminini yazmadan direk olarak Pı sayısını kullanabiliriz 

public class Driver {
	
	//Static bloklar ilgili blokda newlenmeden çağrılırlar
	
	static int i;
	
	static {
		i = 20;
		System.out.println("Static blok");
	}
	
	public static void main(String []args) {
		System.out.println(i);
		//Math sınıfı statick sınıf olduğu için onu kullanırken newlememizi gerek yoktur
		System.out.println(Math.PI);
		
		System.out.println(PI);
	}
}
