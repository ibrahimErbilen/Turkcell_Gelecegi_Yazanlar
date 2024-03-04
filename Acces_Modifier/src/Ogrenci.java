
public class Ogrenci {
	
	public int numara;
	public String ad;
	public String soyad;
	private int yas;
	
	public void setYas(int y) {
		if (y < 0) {
			System.out.println("İnsanın Yaşı negatif olamaz");
			yas = 0;
		}else {
			yas = y;
		}
		
		
	}
	
	public void bilgilriYazdir() {
		System.out.println("Adı : "+ ad);
		System.out.println("Soyad :"+soyad);
		System.out.println("Yas : "+yas);
		System.out.println("Numara : "+numara);
	}
	
	
}
