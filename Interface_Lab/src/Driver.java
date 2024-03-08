
public class Driver {

	public static void main(String[] args) {

		Elma[] elmalar = new Elma[10];
		elmalar[0] = new Elma(10, "Sarı");
		elmalar[1] = new Elma(20, "Kırmızı");
		elmalar[2] = new Elma(100,"Sarı");
		elmalar[3] = new Elma(80, "Yesil");
		elmalar[4] = new Elma(64, "Sarı");
		elmalar[5] = new Elma(43, "Kırmızı");
		elmalar[6] = new Elma(56, "Sarı");
		elmalar[7] = new Elma(76, "Yesil");
		elmalar[8] = new Elma(34, "Sarı");
		elmalar[9] = new Elma(22, "Sarı");

		/*renkFiltrele("Kırmızı", elmalar);
		agirlikkFiltrele(92, elmalar);*/
		
		RenkFiltresi renkFiltresi = new RenkFiltresi();
		AgirlikFİltresi agirlikFİltresi = new AgirlikFİltresi();
		ElmaFiltresi elmaFiltresi = new RenkFiltresi();
		filtrele(renkFiltresi, elmalar);

	}
	public static void filtrele(ElmaFiltresi elmaFiltresi,Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elmaFiltresi.filtrele(elma)) {
				System.out.println(elma.getAgarlik()+" " + elma.getRenk());
			}
		}
	}

	public static void renkFiltrele(String renk, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getRenk().equals(renk)) {
				System.out.println(elma.getRenk() + " " + elma.getAgarlik());
			}
		}
	}
	
	public static void agirlikkFiltrele(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgarlik() >= agirlik) {
				System.out.println(elma.getRenk() + " " + elma.getAgarlik());
			}
		}
	}
}
