import com.example.Araba;
public class Driver {

	public static void main(String[] args) {
		
		/*Method yada değişken belirlerken başına hiçbir şey yazılmaz ise yazılan kodlar Default erişim 
		belirleyicisini alırlar
		
		Javada paketlerin asıl amacı aynı isimli birden fazla sınıfı birbiriyle karıştırmamaktır
		*/
		
		//Ogrenci ogrenci = new Ogrenci();
		/*ogrenci.ad = "Goktuğ";
		ogrenci.soyad = "Çalışkan";
		ogrenci.numara = 150;*/
	
		//ogrenci.numaraYazdir();
		
		/*Araba araba = new Araba();
		araba.marka = "Honda";*/
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.numara = 1;
		ogrenci.ad = "Ali";
		ogrenci.soyad="Can";
		ogrenci.setYas(-12);
		
		ogrenci.bilgilriYazdir();
		

	}

}
