
public class Sekil {

	private String renk;
	private int posX;
	private int posY;

	
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void ekranaYaz() {
		System.out.println("X: "+getPosX());
		System.out.println("Y: "+ getPosY());
		System.out.println("Renk: "+getRenk());
	}
	
	public void alanHesapla() {
		System.out.println("Alan Hesaplanamadı");
	}
	
	

}
