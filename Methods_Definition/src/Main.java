
public class Main {

	// void geriye değer döndürmeyen methodlarda kullanılır
	// static instance almadan methodu kullanmamıza yardım eder

	// void geriye değer döndürmeyen örnek bir method ve instance alınması
	// gerekiyor(yani newlenmesine gerek var bellekte yer edinmesi gerekiyor)
	public void merhaba() {
		System.out.println("Merhaba");
		// merhaba methodunu kullanmamız için instance almamaız gerelit
		// nedeni ise static değildir
	}

	// static void geriyer değer döndermeyen method örneği instance alıması gerekmez
	// static olduğundan bellekte referans değeri vardur
	public static void merhaba2() {
		System.out.println("Static Merhaba");
		// static olduğunda newlenmesine gererk yoktur(instance almaya gerek yoktur)

	}

	//geriye değer döndüren method örneği
	//method imzası ile return tipi aynı olmalıdır
	public int topla(int x, int y) {
		int toplam = x + y;
		return toplam;
	}

	public static void main(String[] args) {
		// main methoddunua enterpoint denir

		Main main = new Main();// instance alma
		main.merhaba(); // method çağırma

		merhaba2();
		
		System.out.println(main.topla(8, 8));
		
		HesapMakinasi makinasi = new HesapMakinasi(); 
		float toplama = makinasi.topla(4.0f, 9.0f);
		System.out.println(toplama);
		
		System.out.println(makinasi.carp(46.0f, 4.0f));
		System.out.println(makinasi.bol(80.0f, 10.0f));
		System.out.println(makinasi.cikar(15.0f, 2.0f));
		System.out.println(makinasi.kare(2));
		System.out.println(makinasi.karekok(64));
		

	}

}
