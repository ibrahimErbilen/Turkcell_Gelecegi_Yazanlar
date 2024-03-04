
public class Telefon {
	
	TelefonTipi tip;
	String marka;
	String model;
	boolean wifi;
	boolean mobileVeri;
	
	boolean aramaVarmi;
	
	void aramaYap(String teleonNumarası) {
		System.out.println("Aranıyor " + teleonNumarası );
		aramaVarmi = true;
	}
	
	void aramayiSonlandir() {
		if (aramaVarmi) {
			System.out.println("Arama Sonlandırıldi");
		}
	}
	
	void mesajGonder(String mesaj) {
		if (mobileVeri) {
			System.out.println("Mesaj Gönderildi");
		}
	}
}
