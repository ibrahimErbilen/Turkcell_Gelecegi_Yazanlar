
public class HesapMakinasi {
	
	public int  topla(int x ,int y){
		return x +y;
	}
	/*
	 * bu şekilde bir kullanıma java izin vermez 
	 * ama derleyici fark eder
	 * vermemesinin sebebi farklı yerden aynı isimli metot olma 
	 * durumdur
	public float topla(int x ,int y) {
		return x +y ;
	}
	*/
	
	public float topla(float x , float y) {
		return x + y;
	}
	
	public float topla(int x , float y) {
		return x + y;
	}
	
	public float topla(float x , int y) {
		return x + y;
	}
	
}
