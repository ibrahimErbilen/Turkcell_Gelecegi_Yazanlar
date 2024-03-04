
public class Driver {

	public static void main(String[] args) {
		
		Kisi kisi =  new Kisi();
		kisi.setIsim("Tuğrul Çalışkan");
		System.out.println(kisi.getIsim());
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Ali Can");
		ogrenci.setDers("Java Programlama");
		
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getDers());
		
		UniOgrenci uniOgrenci = new UniOgrenci();
		uniOgrenci.setIsim("Mehmet Yıldız");
		uniOgrenci.setDers("Java 102");
		uniOgrenci.setKampus("Kutlubey Kampüs");
		System.out.println(uniOgrenci.getIsim());
		System.out.println(uniOgrenci.getDers());
		System.out.println(uniOgrenci.getKampus());
		
		
		//Burada Tekli Ve Çoklu Kalıtım Örnekleri Verilmiştri
		
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.setIsim("Ahmet Yıldız");
		ogretmen.setOkul("X Okul");
		System.out.println(ogretmen.getIsim());
		System.out.println(ogretmen.getOkul());
		
		
		Doktor doktor = new Doktor();
		doktor.setIsim("Emre Aydın");
		doktor.setBrans("Genel Cerrah");
		System.out.println(doktor.getIsim());
		System.out.println(doktor.getBrans());
	}

}
