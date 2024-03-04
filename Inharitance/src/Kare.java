
public class Kare extends Sekil{
	
	//Her kare aslında bir şekildir
	
	private int kenarUzunlugu;

	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
	
	public void ekranaYaz() {
		System.out.println("X: "+getPosX());
		System.out.println("Y: "+ getPosY());
		System.out.println("Renk: "+getRenk());
		System.out.println("Kenar Uzunluğu" +getKenarUzunlugu());
	}
	
	public void alanhesapla() {
		System.out.println("Alan : " +(kenarUzunlugu*kenarUzunlugu));
	}
	
	
}
