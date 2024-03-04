
public class MySQLConnection extends DbConnection{
	
	public void openConnection() {
		System.out.println("MySQL bağlantısı açıldı");
	}
	
	public void closeConnection() {
		System.out.println("MySql bağlantısı kapatıldı");
	}
	
	public void executeQuery(String sql) {
		System.out.println("MySQL Komutları Çalıştırıldı");
	}
}
