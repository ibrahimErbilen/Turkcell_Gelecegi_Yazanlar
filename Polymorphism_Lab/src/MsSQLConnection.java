
public class MsSQLConnection extends DbConnection{

	public void openConnection() {
		System.out.println("MsSql Bağlantısı Açıldı");
	}
	
	public void closeConnection() {
		System.out.println("MsSql Bağlantısı Kapatıldı");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MsSql İş komutları çalıştırıldı");
	}
}
