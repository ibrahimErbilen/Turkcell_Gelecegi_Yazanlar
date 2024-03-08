
public class Driver {

	public static void main(String[] args) {
		
		Kisi kisi = new Kisi("1","Tu");
		System.out.println(kisi.toString());
		
		Kisi kisi2 = new Kisi("1","Tu");
		System.out.println(kisi2.toString());
		
		System.out.println(kisi.equals(kisi2));
	}

}
