import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int[][] numbers = new int[2][3];
		
		numbers[0][0]=1;
		numbers[0][1]=2;
		numbers[0][2]=3;
		
		numbers[1][0]=4;
		numbers[1][1]=5;
		numbers[1][2]=6;
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		String[][] students = new String[3][3];
		students[0][0]= "Ali";
		students[0][1]= "Veli";
		students[0][2]= "Can";

		students[1][0]= "Hasan";
		students[1][1]= "Yusuf";
		students[1][2]= "Mert";
		
		students[2][0]= "Ahmet";
		students[2][1]= "Zeynep";
		students[2][2]= "Gül";
		
		for (int i = 0; i <students.length; i++) {
			for (int j = 0; j <students[i].length; j++) {
				System.out.print(students[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
