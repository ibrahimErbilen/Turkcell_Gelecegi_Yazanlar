
public class Driver {

	public static void main(String[] args) {
		
		Kisi kisi = new Kisi("Ertuğ");
		System.out.println(kisi.getIsim());
		
		Ogrenci ogrenci = new Ogrenci("ALi", 5);
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getNumara());
		ogrenci.ozet();
	}

}
