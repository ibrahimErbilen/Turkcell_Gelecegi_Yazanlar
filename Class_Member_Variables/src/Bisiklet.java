
public class Bisiklet {
	
	int vites;
	int hiz;
	
	//bu şekilde yazıldığında tek bir tane bisiklet değişkeni oluşturulmuş olur
	//ve onu kullanırız
	static int bisikletSayisi = 0;
	
	void bilgileriYazdir() {
		System.out.println(vites);
		System.out.println(hiz);
		System.out.println(bisikletSayisi);
	}
	
}
