package modele;
import java.sql.*;

public class DBConnection {
	public Statement statement = null;
	public Connection connection = null;
	public ResultSet resultset = null;
	
	public DBConnection(String DB) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/l3guidina","root","mynewpassword");
		statement=connection.createStatement();
	}
}
