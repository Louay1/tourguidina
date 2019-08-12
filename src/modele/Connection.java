package modele;
import java.sql.*;

public class Connection {
	public Statement statement = null;
	public java.sql.Connection connection = null;
	public ResultSet resultset = null;
	
	public Connection(String DB) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DB,"root","mynewpassword");
		statement=connection.createStatement();
	}
}
