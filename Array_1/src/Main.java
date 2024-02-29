import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//sadece dizi tipi ve ismi tanımlandığında degerler otamatik ile 0 atnanır referans tipler ise null olaraktanımlanır
		
		int[] numbers = new int[16];
		System.out.println(Arrays.toString(numbers));//boş olduğunda 0 döndürür
		
		//sadece belirli index numarasına ulaşmak için
		System.out.println(numbers[5]);
		
		//belirlenen dizi index değerini değiştirme
		numbers[5] = 32;
		System.out.println(numbers[5]);
		
		int[] numbers1 = {1,2,3,4,5,6,7,8,9,};
		System.out.println(numbers1[5]);
		
		System.out.println(numbers1.length);//dizi eleleman sayısını verir
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));// boş olduğunda null döndürü

		
		names[2] = "Ali";
		System.out.println(Arrays.toString(names));
		
		
	}

}
