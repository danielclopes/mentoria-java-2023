package mentoria.encontro18.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgres";

		try {
			connection = Database.getConnection(dbUrl, user, password);
			statement = connection.createStatement();

			String sql = "select id, nome, sobrenome from autores";
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String nome = resultSet.getString(2);
				String sobrenome = resultSet.getString(3);

				System.out.println(id + " | " + nome + " | " + sobrenome);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			Database.closeResultSet(resultSet);
			Database.closeStatement(statement);
			Database.closeConnection(connection);
		}

	}

}
