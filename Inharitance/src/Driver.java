
public class Driver {

	public static void main(String[] args) {
		
		Sekil sekil =new Sekil();
		sekil.setPosX(40);
		sekil.setPosY(45);
		sekil.setRenk("Turuncu");
		sekil.ekranaYaz();
		sekil.alanHesapla();
		
		System.out.println();
		
		Kare kare = new Kare();
		kare.setPosX(10);
		kare.setPosY(10);
		kare.setRenk("Sarı");
		kare.setKenarUzunlugu(10);
		kare.ekranaYaz();
		kare.alanhesapla();
		
		
		System.out.println();
		
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.setPosX(20);
		dikdortgen.setPosY(30);
		dikdortgen.setRenk("Mavi");
		dikdortgen.setYukseklik(10);
		dikdortgen.setUzunluk(5);
		dikdortgen.ekranaYaz();
		dikdortgen.alanHesapla();
		
		System.out.println();
		
		Daire daire = new Daire();
		daire.setPosX(20);
		daire.setPosY(30);
		daire.setRenk("Mavi");
		daire.setYaricap(5);
		daire.ekranaYaz();
		daire.alanHesapla();
				
		
	}

}
