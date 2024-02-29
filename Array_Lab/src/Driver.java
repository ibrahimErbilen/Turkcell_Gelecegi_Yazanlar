import java.util.Arrays;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		
		//Array kopyalama
		
		int[] numbers = {1,5,-5,9,2,8,9};
		int[] numbers1 = new int [numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers1[i] = numbers[i];
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers1));
		
		
		String[] names = {"Ali","Ahmet","Mehmet"};
		System.out.println(Arrays.toString(names));
		
		for (int i = names.length-1; i >= 0; i--) {
			System.out.print(names[i]+ " ");
		}
		
		
		int[] numbers2 = {1,2,3};
		System.out.println(Arrays.toString(numbers2));
		
		int[]numbers3 = new int[numbers2.length];
		numbers3 = numbers2;
		System.out.println(numbers3);
		
		numbers2[0]= 5;
		System.out.println(numbers3);//değerinin değişmesinin sebebi referans tip olması belleği 
		//heap kısmında duruyor ve eşitlediğimizde aynı adresi göstermiş oluruz
		
		System.out.println(numbers2);//bellek adresleri aynıdır
		System.out.println(numbers3);//bellek adresleri aynıdır
		
	}

}
