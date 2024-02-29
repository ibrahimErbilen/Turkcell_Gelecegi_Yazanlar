import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));// String içerisindeki karakterleri tek tek karşılaştırıyor
		str2 = "HELLO";
		System.out.println(str1.equals(str2));// true döndürecek çünkü casesensetive kullanılmaz
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir Yazı Giriniz : ");
		String line  = scanner.nextLine();
		System.out.println(line.toLowerCase());// bütün karakterleri küçük yazar
		System.out.println(line.toUpperCase());//bütün karakterleri büyük yazar
		System.out.println(line.charAt(3));// 3.index numarısındaki karakteri veriri
		
		System.out.println(line.length());//stringin uzunluğunu veriri
		System.out.println(line.substring(3));//verilen indexten sonrasını yazdırır
		System.out.println(line.isEmpty());//
		System.out.println(line.replace("ab", "dc")); // girilen ab yi dc ile değiştiriyor
		
		System.out.println(line.indexOf("a"));// a karakteri kaçıncı indexte ona bakar
		System.out.println(line.lastIndexOf("d")); // d karakteri kaçıncı indexte ona bakar ama sondanitibaren tarar
		System.out.println(line.trim());//string içerisinde başından ve sonundaki boşukları kaldırı
	}

}
