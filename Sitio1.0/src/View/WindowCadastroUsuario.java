package View;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowCadastroUsuario extends JFrame {

	private JPanel PanelPrincipal;
	private JLabel jlNome;
	private JTextField jtNome;
	private JLabel jlIdUser;
	private JLabel jlSenha;
	private JTextField jtSenha;
	private GridLayout layout;
	private JButton btSalvar;
	private JButton btCancelar;
	private JPanel panelLabels;
	private JPanel panelText;
	private JPanel panelButtons;
	private GridLayout labels;
	private GridLayout texto;
	private GridLayout botoes;
	private JLabel cabecalho;
	private JLabel centro;
	private JLabel rodape;

	public WindowCadastroUsuario(String title, boolean modal) {
		this.setTitle(title);
		cabecalho = new JLabel("",JLabel.CENTER);
		centro = new JLabel("",JLabel.CENTER);
		rodape = new JLabel("",JLabel.CENTER);
		centro.setSize(100,100);
		
		
	
		PanelPrincipal = new JPanel();
		jlIdUser = new JLabel();
		jlNome = new JLabel("Nome");
		jtNome = new JTextField();
		jlSenha = new JLabel("Senha");
		jtSenha = new JTextField();
		btSalvar = new JButton("Salvar");
		btCancelar = new JButton("Cancelar");
		layout = new GridLayout(3,2);
		panelLabels = new JPanel();
		panelButtons= new JPanel();
		panelText= new JPanel();
		
		addComponents();
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400, 500);
		this.setLayout(new GridLayout(3, 1));
		this.setMaximumSize(new Dimension(500, 500));
	}

	private void addComponents() {
		
		this.add(cabecalho);
		this.add(centro);
		this.add(rodape);
		
		panelLabels.add(jlIdUser);
		panelLabels.add(jlNome);
		panelLabels.add(jtNome);
		panelLabels.setLayout(labels);
		
		panelText.add(jlSenha);
		panelText.add(jtSenha);
		panelText.setLayout(texto);
	
		
		panelButtons.add(btSalvar);
		panelButtons.add(btCancelar);
		panelButtons.setLayout(botoes);
		
		PanelPrincipal.add(panelLabels);
		PanelPrincipal.add(panelText);
		PanelPrincipal.add(panelButtons);
		PanelPrincipal.setLayout(layout);

		
		
		
		add(PanelPrincipal);
	}

}
