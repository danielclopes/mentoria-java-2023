package mentoria.encontro18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public static Connection getConnection(String dbUrl, String user, String password) throws SQLException {
		Connection connection = DriverManager.getConnection(dbUrl, user, password);
		connection.setAutoCommit(true);
		return connection;
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres123";
		String password = "postgres";

		try {
			connection = Database.getConnection(dbUrl, user, password);
			System.out.println("Conectado com sucesso!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
