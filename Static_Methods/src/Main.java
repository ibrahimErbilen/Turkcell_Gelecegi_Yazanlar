
public class Main {
	
	public static void merhaba() {
		System.out.println("Merhaba");
	}

	public static void main(String[] args) {
		
		merhaba();
		
		Math.pow(2, 3);//Math sınfı static olarak tanımlanmıştır ve içerisine  instance almamıza gerek yoktu
		
		Integer.parseInt("5"); //parseInt Methoduda static bir methodtur
		
		HesapMakinasi.topla(4, 6);//instance alamadan method çağırabiliriz
		//eğer method static olarak tanımlanmışsa
		//amam bazı noktalar vardır static metgodu çağırmamız için static olan bir yerde çağırmamız gerekir

	}

}
