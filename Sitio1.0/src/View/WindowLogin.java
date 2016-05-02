package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WindowLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel painel = new JPanel();
	private JLabel lnome = new JLabel("Nome : ");
	private JTextField nomeLogin = new JTextField();	
	private JLabel lsenha = new JLabel("Senha : ");
	private JPasswordField senha = new JPasswordField();
	private JButton login = new JButton("Login");
	
	public WindowLogin() {
		painel.add(lnome);
		painel.add(nomeLogin);
		this.setSize(200,300);
		this.setLocation(200, 200);
		this.add(painel);
		
	}
	
}
