

import Model.Usuario;
import View.SwingLayoutDemo;
import View.WindowCadastroUsuario;

public class Main {

	public static void main(String [ ] args){
		Usuario user = new Usuario();
		user.setNome("Maiko");
		System.out.println(user.getNome());
		new WindowCadastroUsuario("ere", false);
	}
	
}
