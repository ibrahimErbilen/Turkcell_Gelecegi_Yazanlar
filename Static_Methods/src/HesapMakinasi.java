
public class HesapMakinasi {

	public static float topla(float x, float y) {
		return x + y;
	}

	public static float cikar(float x, float y) {
		return x - y;
	}

	public static float carp(float x, float y) {
		return x * y;
	}

	public static float bol(float x, float y) {
		return x / y;
	}
	
	public static float kare(int x) {
		return (float)Math.pow(x,2);//(float)Math olan kısıma casting denit
		//math sınfı double dönderdiği için cating yaptık
	}
	
	public static float karekok(int x) {
		return (float)Math.sqrt(x);
	}
}
