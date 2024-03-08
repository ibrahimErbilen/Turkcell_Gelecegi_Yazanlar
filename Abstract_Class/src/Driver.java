
public class Driver {

	public static void main(String[] args) {
		
		/*
		 * Soyut sınfıların mantığı kendisinden türeyecek olan sınıflara ara bir
		 * katman oluşturmak ve ortak özelliklerini belirli yerlerde tutmaktır
		 * 
		 * */
		
		Oyuncu oyuncu = new Basketbolcu();
		oyuncu.setIsim("Ali Can");
		oyuncu.setNumarası(10);
		oyuncu.pasVer();
		oyuncu.sutCek();

	}

}
