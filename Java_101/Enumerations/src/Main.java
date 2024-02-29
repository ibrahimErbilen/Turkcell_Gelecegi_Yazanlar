import java.time.DayOfWeek;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		
		Aylar ay ;
		ay = Aylar.EKIM;
		System.out.println(ay);
		
		ay = Aylar.AGUSTOS;
		System.out.println(ay);
		
		System.out.println(" ");
		
		Aylar[] values = Aylar.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		System.out.println(" ");
		
		Aylar valueOf =Aylar.valueOf("SUBAT");
		System.out.println(valueOf);
		
		DayOfWeek sunday = DayOfWeek.FRIDAY;
		System.out.println(sunday);
		
		Month mo = Month.APRIL;
		System.out.println(mo);
		
	}

}
