
public class Driver {
	
	public static void main(String[] args) {
		
		Daire daire ;
		daire = new Daire();// ilklendirme yapıcı method sayesinde gerçekleşir
		//Tanımlamadan sonra bellekte daire için yeteri kadar yer ayrılmıştır
		daire.x = 10;
		daire.y = 20;
		daire.r = 3;
		
		System.out.println(daire.x);
		System.out.println(daire.y);
		System.out.println(daire.r);
		
		
		double alanHesapla = daire.alanHesapla();
		double cevreHesapla = daire.cevreHesapla();
		System.out.println(alanHesapla);
		System.out.println(cevreHesapla);
		
		Daire daire2 = new Daire();
		daire2.r = 45;
		System.out.println(daire2.alanHesapla());
		System.out.println(daire2.alanHesapla());
		
		//Daire daire3 = null;// bellekte hiç bir yerde point olmadığı ifade eder
		//daire3.r = 30; //sytax olarak hata almayız ama çalıştırdığımızda NullPoint Exeption hatası alırız
		
		Daire daire3 = daire2;
		daire3.r = 30;
		
		System.out.println("daire 2 " + daire2.r);
		System.out.println("daire 3 " +daire3.r);
		
	}
}
