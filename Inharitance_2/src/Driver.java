
public class Driver {

	public static void main(String[] args) {
		
		NakliyeAraci nakliyeAraci = new NakliyeAraci();
		nakliyeAraci.setUretici("X Marka");
		nakliyeAraci.setYukKapasitesi(1000);
		
		Tir tir = new Tir();
		tir.setUretici("Y Markası");
		tir.setYukKapasitesi(2000);
		tir.setKonteynirSayisi(20);

	}

}
