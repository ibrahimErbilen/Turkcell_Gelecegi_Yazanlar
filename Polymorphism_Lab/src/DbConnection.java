
public class DbConnection {

	public void openConnection() {
		System.out.println("Veritabanına bağlantısı açıldı");
	}
	
	public void closeConnection() {
		System.out.println("Veritabanu bağlantısı kapatıldı");
	}
	
	public void executeQuery(String sql) {
		System.out.println("Sql Komutları Çalıştırıldı");
	}
}
