
public class Daire extends Sekil{
	
	private double yaricap;

	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	
	public void alanHesapla() {
		System.out.println("Alan :" + (Math.PI*Math.pow(yaricap, 2)));
	}
	
	public void ekranaYaz() {
		System.out.println("X: "+getPosX());
		System.out.println("Y: "+ getPosY());
		System.out.println("Renk: "+getRenk());
		System.out.println("Yarı Çap :" +getYaricap());
	}
	
}
