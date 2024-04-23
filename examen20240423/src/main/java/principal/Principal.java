package principal;

import java.awt.Menu;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;


import principal.views.PanelTabla;



public class Principal extends JFrame{

	static Principal instance = null;
	PanelTabla pt = PanelTabla.getInstance();
	

	public static Principal getInstance() {
		if (instance == null) {
			instance = new Principal();
		}
		return instance;
	}
	
	

	public Principal() {
		super("Gestion de centro Educativo");
		this.setBounds(0,0,800,600);

		
		

		
		this.getContentPane().add(pt);
		
	}
	
	
	
	





	public static void main(String[] args) {

		Principal.getInstance().setVisible(true);
		
	}

}
