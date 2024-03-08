import java.util.Date;

public class Driver {
	
	public static void main(String[] args) {
		
		Calisan calisan1 = new Calisan();
		Calisan calisan2 = new Calisan("IT");
		Calisan calisan3 = new Calisan("IT","ALİ CAN");
		Calisan calisan4 = new Calisan("IT","ALİ CAN",new Date());
		
		calisan1.bilgileriYazdir();
		calisan2.bilgileriYazdir();
		calisan3.bilgileriYazdir();
		calisan4.bilgileriYazdir();
		
	}
}
