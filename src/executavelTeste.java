public class executavelTeste {
	
	public static void main(String[] args){
		usuario corredor = new usuario();
		usuarioDAO x = new usuarioDAO();
		corredor.setLogin_("Augusto");  
		corredor.setSenha_("1234");
		corredor.setPeso_(64);
		corredor.setNome_("Felipe Alcântara");
		x.inserirUsuario(corredor);
		System.out.printf("Gravado!");
			
		System.out.printf("Olá");
	}
}