package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class WindowCadastroUsuario extends JWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private JLabel jlNome;
	private JLabel jlIdUser;
	private JLabel jlSenha;
	
	private JTextField jtNome;
	private JTextField jtSenha;
	
	private JButton btSalvar;
	private JButton btCancelar;
	
	JPanel panelPrincipal;
	
	
	public WindowCadastroUsuario(String title) {
		super.windowInit();
		panelPrincipal = new JPanel();
		
		
		panelPrincipal.setOpaque(true);
		panelPrincipal.setBackground(Color.blue);
		
		this.add(panelPrincipal);
	}

	

}
