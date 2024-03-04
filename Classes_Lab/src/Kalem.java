
public class Kalem {
	
	String marka;
	String tip;
	boolean doldurabilir;
	boolean silinebilir;
	
	
	void yaz(String metin) {
		System.out.println(metin);
	}
	
	void tekrarDoldur() {
		if(doldurabilir) {
			// kalemi doldur
			System.out.println("Kalem dolduruldu");
		}else {
			System.out.println("Bu Kalem doldurulamaz");
		}
	}
	
	void sil() {
		if (silinebilir) {
			//yazıyı sil
			System.out.println("Yazı silindi");
		}else {
			System.out.println("Kalemde silgi yok");
		}
	}
}
