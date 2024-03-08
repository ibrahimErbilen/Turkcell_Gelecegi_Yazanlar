
public class Driver {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci = new  Ogrenci(1);
		System.out.println(ogrenci.getNumara());
		
		UniOgrenci ogrenci2 = new UniOgrenci(5);
		//System.out.println(ogrenci2.getNumara());
		ogrenci2.yazdir();
	}
	
}
