
public class Main {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);//Math sınfı içerisindeki PI sayısına ulaşırız		
		System.out.println(Math.pow(2, 3));//içerisine girilen sayının karesini alır
		System.out.println(Math.sqrt(64));//Girilen sayının karekökünü bulmaya yarıyor
		System.out.println(Math.min(5, 9));//kendisine verilen değişkenlerden küçük olanı bize döndürür
		System.out.println(Math.max(6, 9));//kendisine verilen değikenelerden büyük olanı döndürür
		
		float f = 1.6f;
		System.out.println(Math.ceil(f));//kendine verilen değeri üstüne yuvarlar
		System.out.println(Math.floor(f));//kendisine verilen değeri altına yuvarlar
		System.out.println(Math.round(f));//en yakın tam sayı ne ise ona yuvarlanır
		System.out.println(Math.random());//0 ile 1 arasında rastgele sayı döndürür
	}

}
