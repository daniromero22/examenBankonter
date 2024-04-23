package principal.controllers;

import principal.entities.Sexo;

public class ControladorSexo extends SuperControlador {
	
	private static ControladorSexo instance = null;
	
	public ControladorSexo() {
		super("sexo", Sexo.class);
		// TODO Auto-generated constructor stub
	}

	public static ControladorSexo getInstance() {
		if (instance == null) {
			instance = new ControladorSexo();
		}
		return instance;
	}

}
