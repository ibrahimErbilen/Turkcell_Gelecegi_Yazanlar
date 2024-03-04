import java.util.Date;

public class Driver {
	
	public static void main(String[] args) {
		/*Calisan calisan = new Calisan();
		calisan.setIsim("Ali Can");
		calisan.setMaas(2000.0);
		calisan.setIseGirisTarihi(new Date());
		
		calisan.degerOku();*/
		
		Kare kare = new Kare();
		kare.setX(10);
		kare.setY(-5);
		kare.setUzunluk(100);
		
		kare.ekranaYazdir();
		
		System.out.println(kare.getX());
		
	}
}
