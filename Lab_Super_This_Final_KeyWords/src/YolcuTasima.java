
public class YolcuTasima extends Arac{
	
	private int kapasite;

	public YolcuTasima(String plaka, String marka, int kapasite) {
		super(plaka, marka);
		this.kapasite = kapasite;
	}

	public int getKapasite() {
		return kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	
	

}
