
public class Dikdortgen extends Sekil{

	private int genislik;
	private int yukseklik;

	public Dikdortgen(int genislik, int yukseklik) {

		this.genislik = genislik;
		this.yukseklik = yukseklik;
	}

	public int getGenislik() {
		return genislik;
	}

	public void setGenislik(int genislik) {
		this.genislik = genislik;
	}

	public int getYukseklik() {
		return yukseklik;
	}

	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
	
	public void alan() {
		System.out.println("Dikdörtgen Alan :"+ (genislik*yukseklik));
	}

}
