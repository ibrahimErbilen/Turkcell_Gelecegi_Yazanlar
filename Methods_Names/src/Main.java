import java.sql.Driver;

public class Main {

	private void helloWorld() {
		System.out.println("Hello World");
	}
	
	private int topla(int x,int y) {        
		int toplam = x + y;
		return toplam;
	}
	
	private float topla(float x,int y) {  //OverLoad
		float toplam = x + y;
		return (float)toplam;
	}
	
	private float topla(float x,float y) {
		float toplam = x + y;
		return (float)toplam;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.helloWorld();
		System.out.println(main.topla(7, 10));
		
		
	}

}
