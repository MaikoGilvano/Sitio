package BaseWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WindowLoading extends JWindow{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel panel = new JPanel();
	JProgressBar progressBar = new JProgressBar();
	
	
	public void startLoading(){
		panel.setBackground(Color.BLUE);
		panel.setLayout(new BorderLayout());
		panel.add(progressBar, BorderLayout.SOUTH);
		panel.setFocusable(true);
		progressBar.setStringPainted(true);
		add(panel);
		
		javax.swing.Timer timer = new javax.swing.Timer(100, new ActionListener() {
			int i = 0;
			
			public void actionPerformed(ActionEvent ev) {
				progressBar.setValue(i);
				i++;
				panel.repaint();
				if(i == 100){
					((javax.swing.Timer) ev.getSource() ).stop();
					dispose();
				}
				
			}
		});
		timer.start();
		
	}
	
	public WindowLoading(){
		try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
	
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					WindowLoading w = new WindowLoading();
					w.setSize(640, 480);
					w.setLocationRelativeTo(null);
					w.setVisible(true);
				}
			});
	
		}	
	
}
