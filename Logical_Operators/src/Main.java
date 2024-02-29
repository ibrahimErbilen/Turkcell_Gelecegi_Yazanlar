
public class Main {
	
	public static boolean test() {
		System.out.println("Test Çalıştı");
		return false;
	}

	public static void main(String[] args) {
		boolean b = true;
		
		System.out.println(b);
		
		System.out.println(!b); //kendisine verilen değerin tersine alır
		System.out.println(b & false); //karşılaştırma
		// false & false = false
		// false & true = false
		// true & false = false
		// true & true = true
		
		//false | false = false
		//false | true = true
		//true | false = false
		//true | true = true
		
		System.out.println(b | false); // false
		System.out.println(b && test()); // Çalışma şekili ilk olarak soldan başlar eğer soldaki değer false ise sağ tarafa bakmaz
		System.out.println(b || test());
		
	}

}
