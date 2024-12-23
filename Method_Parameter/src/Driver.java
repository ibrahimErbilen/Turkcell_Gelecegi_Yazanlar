import java.lang.reflect.Array;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new  Driver();
		/*int x = 20;
		System.out.println(x);
		driver.passByValue(x);
		System.out.println(x);
		*/
		
		/*int[] sayilar = {1,2,3,4,5};
		System.out.println(Arrays.toString(sayilar));
		driver.degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));
		*/
		
		driver.test(5);
		
		driver.varArgs(new int[] {1,2});
	}
	
	// public void varArgs(int... x) aynı anlama gelmete
	public void varArgs(int[] numbers) {
		int x = numbers[0];
		int y = numbers[1];
		System.out.println(x+y);
	}
	
	public void test(final int x) {
		//x=10;
		System.out.println(x);
	}
	
	public void degistir(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = sayilar[i]*2;
		}
	}
	
	public void passByValue(int x) {
		System.out.println("PBV" +x);
		x=10;
		System.out.println("PBV" +x);
	}

}
