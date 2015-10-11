
import java.sql.*;

public class FactoryConnection {
	public Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/CorridAthos", "felipe", "lipe1206");
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}