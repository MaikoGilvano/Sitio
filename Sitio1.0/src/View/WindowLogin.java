package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
	private JPanel pNome = new JPanel();
	private JPanel pSenha = new JPanel();
	private JPanel pButton = new JPanel();
	

	private JLabel lnome = new JLabel("Nome : ");
	private JLabel lsenha = new JLabel("Senha : ");

	private JTextField nomeLogin = new JTextField("Nome");

	private JPasswordField senha = new JPasswordField("Senha");

	private JButton login = new JButton("Login");
	private JButton cancelar = new JButton("Sair");
	
	public WindowLogin() {
		

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		painel.setLayout( new BorderLayout());
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		pNome.setLayout(new BoxLayout(pNome, BoxLayout.LINE_AXIS));
		pNome.add(lnome);
		pNome.add(Box.createHorizontalGlue());
		pNome.add(Box.createRigidArea(new Dimension(5,2)));
		pNome.add(nomeLogin);
		painel.add(pNome, BorderLayout.NORTH);
		
		
		pSenha.setLayout(new BoxLayout(pSenha, BoxLayout.LINE_AXIS));
		pSenha.add(lsenha);
		pSenha.add(Box.createHorizontalGlue());
		pSenha.add(Box.createRigidArea(new Dimension(5,2)));
		pSenha.add(senha);
		painel.add(pSenha, BorderLayout.CENTER);
		
		pButton.setLayout(new BoxLayout(pButton, BoxLayout.LINE_AXIS));
		pButton.add(login);
		pButton.add(Box.createHorizontalGlue());
		pButton.add(Box.createRigidArea(new Dimension(5,2)));
		pButton.add(cancelar);	
		painel.add(pButton, BorderLayout.SOUTH);
		
		this.setSize(300,100);
		
		this.add(painel);
		
		this.setVisible(true);
		this.setTitle("Login");
		
		pack();
		
		
		cancelar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	
		
}
