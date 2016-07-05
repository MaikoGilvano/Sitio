package BaseWindow;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InvokeLoadWindow {
	
	public InvokeLoadWindow(){
		invoke();
	}
	
	private void invoke(){
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
