
public class Driver {

	public static void main(String[] args) {

		/*
		 * Sınıflar Gerçek Dünya'daki nesnelerin programlama dünyasına aktaran
		 * yapılardır
		 * 
		 * 2 Temel özelliği vardır. - Değişkenler(State) - Davranışlar(Behavior)
		 * 
		 * Java 2 temel değişken tipi vardır Bunlar primitive tipler ve referans
		 * tiplerdir.Sınıflar referans tipindeki yapılardır
		 */

		/*
		 * Kalem kursunKalem = new Kalem(); kursunKalem.marka = "A Marka";
		 * kursunKalem.tip = "KursunKalem"; kursunKalem.doldurabilir = false;
		 * kursunKalem.silinebilir = true;
		 * 
		 * kursunKalem.yaz("Kursun kalem yazdı "); kursunKalem.tekrarDoldur();
		 * kursunKalem.sil();
		 * 
		 * System.out.println("*-----------------*");
		 * 
		 * Kalem dolmaKalem = new Kalem(); dolmaKalem.marka = "B Marka"; dolmaKalem.tip
		 * = "Dolma Kalem"; dolmaKalem.doldurabilir = true; dolmaKalem.silinebilir =
		 * false;
		 * 
		 * dolmaKalem.yaz("Dolma kalem yazdı"); dolmaKalem.tekrarDoldur();
		 * dolmaKalem.sil();
		 */
		
		//abstraction kendi oluşturduğumuz sınıfları başkaları kullanırken hata yapmalarını mi indirirken
		//oluşturduğumuz methodların içerisini ona göre düzenlememizdir
		
		//iç detaylarını bilmeden methodları kullanılması

		/*Telefon telefon = new Telefon();
		telefon.marka = "X Marka";
		telefon.model = "Y Model";
		telefon.tip = TelefonTipi.CEP;
		telefon.mobileVeri = true;
		telefon.wifi = true;
		
		telefon.aramaYap("555555555");
		telefon.aramayiSonlandir();
		telefon.mesajGonder("Mesaj Gönder Kullanıldı");
		*/
		
		Kopek kangal = new Kopek();
		kangal.cins = "Sivas Kangal";
		kangal.boyut = Boyut.BUYUK;
		kangal.renk = Renk.SIYAH;
		kangal.yas = 6;
		
		kangal.yemekYe();
		kangal.otur();
		kangal.kos();
		kangal.uyu();

	}

}
