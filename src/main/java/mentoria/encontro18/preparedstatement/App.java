package mentoria.encontro18.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		String dbUrl = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgres";

		try {
			connection = Database.getConnection(dbUrl, user, password);
			String sql = "select id, nome, sobrenome from autores where id=?";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 1);

			resultSet = preparedStatement.executeQuery();
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
			Database.closePreparedStatement(preparedStatement);
			Database.closeConnection(connection);
		}

	}

}
