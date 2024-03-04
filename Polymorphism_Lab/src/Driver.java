import java.util.Iterator;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		DbConnection connection = (DbConnection) Class.forName(args[0]).newInstance();
		connection.openConnection();
		connection.executeQuery("SELECT * FROM student");
		connection.closeConnection();
		
		
		/*
		 * DbConnection connection = new DbConnection(); connection.openConnection();
		 * connection.executeQuery("SELECT * FROM student");
		 * connection.closeConnection(); System.out.println();
		 * 
		 * MySQLConnection connection2 = new MySQLConnection();
		 * connection2.openConnection();
		 * connection2.executeQuery("SELECT * FROM student");
		 * connection2.closeConnection(); System.out.println();
		 * 
		 * MsSQLConnection connection3 = new MsSQLConnection();
		 * connection3.openConnection();
		 * connection3.executeQuery("SELECT * FROM student");
		 * connection3.closeConnection();
		 */

		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Database tipi seçimiz [1 MsSQL , 2 MySQL , 3 Oracle");
		int dbType = scanner.nextInt();
		DbConnection dbConnection = null;
		switch (dbType) {
		case 1: {
			dbConnection = new MySQLConnection();
			break;
		}
		case 2: {
			dbConnection = new MySQLConnection();
			break;
		}
		case 3: {
			dbConnection = new OracleDbConnection();
			break;
		}
		default:
			System.out.println("Lütfen 1-3 arasında rakam giriniz");

		}

		if (dbConnection != null) {
			dbConnection.openConnection();
			dbConnection.executeQuery("SELECT * FROM student");
			dbConnection.closeConnection();
		}*/

	}

}
