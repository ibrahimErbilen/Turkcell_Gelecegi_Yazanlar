
public abstract class Oyuncu {
	
	private String isim;
	private int numarası;
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNumarası() {
		return numarası;
	}
	public void setNumarası(int numarası) {
		this.numarası = numarası;
	}
	
	public abstract void sutCek();
	
	public abstract void pasVer();
		
	
	
}
