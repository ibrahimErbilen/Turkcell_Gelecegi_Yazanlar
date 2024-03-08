import java.util.Date;

public class Driver {
	
	public static void main(String[] args) {
		
		Calisan calisan = new Calisan("Mustafa",400,new Date());
		//calisan.setIsim("Ahmet");
		//calisan.setMaas(4000);
		//calisan.setIseBaslamaTarihi(new Date());
		
		calisan.bilgileriYazdir();
	}

}
