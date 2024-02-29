
public class Main {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		
		System.out.println(a && b); // ilk deger false ise ikinci degere bakılmayacaktır
		System.out.println(a || b); // ilk deger true ise ikinci degere bakılmayacaktır
		System.out.println(!a); // degerin tersini döndürür
		System.out.println(!a && b);

	}

}
