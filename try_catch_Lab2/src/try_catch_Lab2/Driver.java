package try_catch_Lab2;

public class Driver {

	public static void main(String[] args) {
		
		Isci isci = new Isci();
		try {
			isci.setIsim("Tuğrul");
		} catch (HataliDeger e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			isci.setMaas(-24400);
		} catch (HataliDeger e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(isci.toString());
	}

}
