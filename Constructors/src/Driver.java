
public class Driver {
	int x;
	//Biz ctor yazmasakta Java kendisi ctor oluşturuyor
	public Driver() {
		System.out.println("ctor");
	}
	
	

	public static void main(String[] args) {
		//Driver driver = new Driver();
		//System.out.println(driver.x);
		
		Ogrenci ogrenci = new Ogrenci("Ahmet","Pasa",5);
		System.out.println(ogrenci.ad);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.yas);
		
		Ogrenci ogrenci2 = new Ogrenci();
		System.out.println(ogrenci2.ad);
		System.out.println(ogrenci2.soyad);
		System.out.println(ogrenci2.yas);
		
	}
}
