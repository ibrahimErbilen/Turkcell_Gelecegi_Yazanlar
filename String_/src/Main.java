
public class Main {

	public static void main(String[] args) {
		String firstName = "John";
		System.out.println(firstName.charAt(1)); //belirli indexdeki char tipini döndürür
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.toLowerCase());
		System.out.println(firstName.replace("o", "a"));
		System.out.println(firstName.length());
		System.out.println(firstName.substring(2));
		System.out.println(firstName.codePointAt(0));// ilk char  Unicorn değerini döndürür
		System.out.println(firstName);

	}

}
