
public class Dikdortgen extends Sekil {

	private int uzunluk;
	private int yukseklik;

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	public void ekranaYaz() {
		System.out.println("X: "+getPosX());
		System.out.println("Y: "+ getPosY());
		System.out.println("Renk: "+getRenk());
		System.out.println("Yükseklik :"+getYukseklik());
		System.out.println("Uzunluk : "+getUzunluk());
	}
	
	public void alanHesapla() {
		System.out.println("Alan : "+ (uzunluk*yukseklik));
	}

}
