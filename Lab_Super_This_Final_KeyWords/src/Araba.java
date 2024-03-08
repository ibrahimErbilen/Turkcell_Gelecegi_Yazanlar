
public class Araba extends YolcuTasima{

	private int kapiSayisi;
	
	public Araba(String plaka, String marka, int kapasite, int kapiSayis) {
		super(plaka, marka,kapasite);
		this.kapiSayisi = kapiSayisi;
	}

	public int getKapiSayisi() {
		return kapiSayisi;
	}

	public void setKapiSayisi(int kapiSayisi) {
		this.kapiSayisi = kapiSayisi;
	}
	
	

}
