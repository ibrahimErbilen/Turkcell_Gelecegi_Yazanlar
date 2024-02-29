
public class Driver {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.isim = "Tuğrul";
		ogrenci.yas = 8;
		
		Driver driver = new Driver();
		driver.ogrenciBilgileri(ogrenci);
		
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);

	}
	public void ogrenciBilgileri(Ogrenci ogrenci) {
		ogrenci.isim = "Ertuğ";
		
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}

}
