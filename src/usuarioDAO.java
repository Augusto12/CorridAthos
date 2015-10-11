import java.sql.*;

public class usuarioDAO {
	private Connection connection;
	public usuarioDAO(){
		this.connection = new FactoryConnection().getConnection();
	}
	
	public void inserirUsuario(usuario Usuario){
		String sql = "insert into usuario" + "(login, senha, nome, peso)" + "values(?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, Usuario.getLogin_());
			stmt.setString(2, Usuario.getSenha_());
			stmt.setString(3, Usuario.getNome_());
			stmt.setDouble(4, Usuario.getPeso_());
			stmt.execute();
			stmt.close();
		
	} catch (SQLException e){
		throw new RuntimeException(e);
	}
	}
	
	public void excluirUsuario(usuario Usuario){
		String sql = "delete from" + " usuario where login = ?" ;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, Usuario.getLogin_());
			
			stmt.execute();
			stmt.close();
		
	} catch (SQLException e){
		throw new RuntimeException(e);
	}
	}
	
	public void consultarUsuario(usuario Usuario){
		String sql = "select from usuario" + "where login = ?" ;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			//TODO mecanismo de busca;
			stmt.close();
		
	} catch (SQLException e){
		throw new RuntimeException(e);
	}
	}
	
}
