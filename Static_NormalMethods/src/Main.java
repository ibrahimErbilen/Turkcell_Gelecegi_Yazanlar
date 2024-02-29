
public class Main {

	private int x = 20;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.normalMethod();
	
		staticMethod();
		System.out.println(max(5, 6, 7));

	}
	
	public void normalMethod() {
		//x değeri static olduğunda methodlar içerisinde instance olmadanda
		// var olabileceği için normal methodlarda kullanılabilirler
		
		System.out.println(x);
	}
	
	public static void staticMethod() {
		//int x olarak tanımladığımız değer static olmadığından static bir method 
		//içerisinde otanımlanamayacaktır tanımlanması için instance (new lenmesi gerekmektedir)
		
		//Açıklaması : girilmiş olan değişken referans belleğe atılmaya bilir bu yüzden 
		//newlemek zorundayız
		Main main = new Main();
		
		
		System.out.println(main.x);
	}
	
	public static int max(int x,int y, int z) {
		int max = x;
		if(y>max)max = y;
		if(z>max)max = z;
		
		return max;
	}

}
