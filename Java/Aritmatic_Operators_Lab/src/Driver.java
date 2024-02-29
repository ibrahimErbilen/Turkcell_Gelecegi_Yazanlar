
public class Driver {

	public static void main(String[] args) {
		
		             //bellekte bu şekilde olur
		int i = 10; //00000000 00000000 00000000 00001010
		System.out.println(~i);
					//11111111 11111111 11111111 11110101
		
		int x = 4; // 0000000 0000000 0000000 0000100
		
		System.out.println(i & x ); // 0 & 0 = 0 
									// 0 & 1 = 0 
									// 1 & 0 = 0 
									// 1 & 1 = 1
		
					//Yapıldığında karşılaştırlma yapılıyor
					// 00000000 00000000 00000000 00001010 = i
					// 00000000 00000000 00000000 00000100 = x
					// 00000000 00000000 00000000 00000000 = i & x
		
		System.out.println(i | x ); // 0 | 0 = 0 
									// 0 | 1 = 0 
									// 1 | 0 = 0 
									// 1 | 1 = 1
					// Yapıldığında karşılaştırlma yapılıyor
					// 00000000 00000000 00000000 00001010 = i
					// 00000000 00000000 00000000 00000100 = x
					// 00000000 00000000 00000000 00001110 = i | x
		
		System.out.println(x >> 1); // 0000000 0000000 0000000 0000010 olduğunda sağa doğru bütün hepsi kayar
		
		System.out.println(x << 1); // 0000000 0000000 0000000 0001000 olduğunda sola doğru bütün hepsi kayar
	}

}
