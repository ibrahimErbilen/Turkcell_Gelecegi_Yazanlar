import java.util.Iterator;

public class Main {

	private int x = 20;
	
	public static void main(String[] args) {
		Main main = new Main();
//		main.normalMethod();
//	
//		staticMethod();
//		System.out.println(max(5, 6, 7));
//		
//		System.out.println(main.majority(true, false, true));
//		
//		int[] x = {1,2,3};
//		int[] y = {1,2,3,4};
//		System.out.println("eq");
//		System.out.println(eq(x, y));
//		System.out.println(cube(5));
//		
//		int[] numbers = {2,6,5,8,9};
//		System.out.println(toplam(numbers));
//		
//		//int[]sonucCiftSayilar = ciftSayilar(new int[] {1,2,3,4,5,6,7,9});
//		//.out.println(sonucCiftSayilar.toString());
		
		int x2 = 10;
		int y2 = 20;
		 
		degistir(x2, y2);
		System.out.println(x2 + " " + y2);
		
	}
	
	public static void degistir(int x, int y) {
		//primitive typlarda çalışmaz method içerisine bir kopyasını gönderiyor
		int temp = x;
		x=y;
		y=temp;
	}
	
	public static int[] ciftSayilar(int[] sayilar) {
		int[] sonuc = null;
		int adet=0;
		for (int i = 0; i < sonuc.length; i++) {
			if (sayilar[i] % 2 == 0) {
				adet++;
			}
		}
		sonuc = new int[adet];
		int index = 0;
		for (int i = 0; i < sonuc.length; i++) {
			if (sayilar[i] % 2 == 0) {
				sonuc[index++] = sayilar[i];
			}
		}
		return sonuc;
	}
	
	
	public static int toplam(int[] x) {
		int result = 0;
		for (int i = 0; i < x.length; i++) {
			result+=x[i];
		}
		
		return result;
	}
	
	public static int cube(int x) {
		return x*x*x;
	}
	
	public static boolean eq(int[] x,int[]y) {
		boolean result = true;
		if (x.length == y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] != y[i]) {
					break;
				}
			}
		}else {
			result = false;
		}
		return result;
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
	
	public static boolean majority(boolean x,boolean y,boolean z) {
		return (x&&y) || (x&&z) || (y&&x);
	}

}
