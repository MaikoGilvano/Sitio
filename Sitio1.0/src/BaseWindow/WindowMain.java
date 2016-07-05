package BaseWindow;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JWindow;

public class WindowMain extends JWindow{
	
	GridLayout grid;
	BorderLayout border;
	JPanel panel;
	
	public WindowMain(String title,boolean isModal) {
			
		this.setComponentOrientation(getComponentOrientation());
		this.setVisible(true);
		
		initComponents();
		
		
	}
	
	public void initComponents(){
		grid = new GridLayout();
		border = new BorderLayout();
		panel = new JPanel();
	}
		
}
