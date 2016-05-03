package View;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WindowLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel painel = new JPanel();
	private JPanel painelCampos = new JPanel();
	private JPanel painelBotao = new JPanel();
	private JPanel painelPreenche = new JPanel();

	private JLabel lnome = new JLabel("Nome : ");
	private JLabel lsenha = new JLabel("Senha : ");

	private JTextField nomeLogin = new JTextField("Nome");

	private JPasswordField senha = new JPasswordField("Senha");

	private JButton login = new JButton("Login");

	private GridLayout layoutTexto = new GridLayout(2, 2, 5, 5);
	private GridLayout layoutGeral = new GridLayout(2, 1, 8, 8);
	private GridLayout layoutButton = new GridLayout(1, 1, 20, 20);

	private GridBagConstraints constraintsCampos = new GridBagConstraints();
	private GridBagLayout layout = new GridBagLayout();
	
	public WindowLogin() {

		painelCampos.add(lnome);
		painelCampos.add(nomeLogin);
		painelCampos.add(lsenha);
		painelCampos.add(senha);
		painelCampos.setLayout(layoutTexto);

		painelBotao.add(login);

		painelBotao.setLayout(layoutButton);

		painel.add(painelCampos);
		painel.add(painelBotao);
		painel.setLayout(layoutGeral);
		
		this.setLayout(layout);

		constraintsCampos.gridx = 5;
		constraintsCampos.gridy = 5;
		constraintsCampos.gridwidth = 1;
		constraintsCampos.gridheight = 1;
		layout.setConstraints(painel, constraintsCampos);
		this.add(painel);
	
		

		this.setTitle("Login Sitio");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
