package try_catch_Lab2;

public class HataliDeger extends Exception{

	public HataliDeger(String string, Object deger) {
		super(string + " " + deger + " olamaz");
	}
}
