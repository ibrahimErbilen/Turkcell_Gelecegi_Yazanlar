import java.util.Arrays;

public class Arraymethod {

	public static void main(String[] args) {
		
		int[] numbers = {20,32,12,46,5};
		System.out.println(Arrays.toString(numbers));//çıktı almamıza yardım eder
		System.out.println(Arrays.binarySearch(numbers, 12));//ilk virgülde diziyi belirtiriz ikinci virgülde hangi
		//sayıyı arıyor isek onu belirtiriz o da varsa eğer index numarasını bize verir eğer yoksa -1 döndürür
		
		int[] copyOf = Arrays.copyOf(numbers, 3);//seçdiğimiz diziyi kaç tane değerini yazarsak o kadarını kopyalar
		System.out.println(Arrays.toString(copyOf));
		
		int[] copyOfRange =  Arrays.copyOfRange(numbers, 2, 4); //seçdiğimiz dizideki belirli değerler arasını kopkayalamaya ayarıyor
		System.out.println(Arrays.toString(copyOfRange));
		
		Arrays.sort(numbers);//Dizileri küçükten büyüğe sıralar
		System.out.println(Arrays.toString(numbers));
		
		Arrays.fill(numbers, 44);//seçdiğimiz arrayin içerisindeki bütün değerleri yazdığımız rakama çevirir
		System.out.println(Arrays.toString(numbers));
		
		
	}

}
