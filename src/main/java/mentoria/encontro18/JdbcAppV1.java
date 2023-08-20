package mentoria.encontro18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAppV1 {

	public static String USER = "postgres";
	public static String PASSWORD = "postgres";
	public static String URL = "jdbc:postgresql://localhost:5432/postgres";

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from autores");
			// obtém os metadados de ResultSet
			ResultSetMetaData metaData = resultSet.getMetaData();

			int numberOfColumns = metaData.getColumnCount();

			System.out.printf("Tabela de autores:%n");
			// exibe os nomes de coluna no ResultSet
			for (int i = 1; i <= numberOfColumns; i++)
				System.out.printf("%-8s\t", metaData.getColumnName(i));

			System.out.println();
			// exibe os resultados da consulta
			while (resultSet.next()) {
				for (int i = 1; i <= numberOfColumns; i++)
					System.out.printf("%-8s\t", resultSet.getObject(i));

				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
