package principal.controllers;

import java.util.List;

import principal.entities.Contrato;

public class DatosDeTabla {

	private static Object[][] datos = null;
 	
	
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "Descripcion", "FechaFirma", "Saldo", "Limite", "IdUsuario"};
	}
	
	
	public static Object[][] getDatosDeTabla() {
		if (datos == null) {
			List<Contrato> contratos = (List<Contrato>) ControladorContrato.getInstance().findAll();
			datos = new Object[contratos.size()][11];
			for (int i = 0; i < contratos.size(); i++) {
				Contrato e = contratos.get(i);
				datos[i][0] = e.getId();
				datos[i][1] = e.getDescripcion();
				datos[i][2] = e.getFechaFirma();
				datos[i][3] = e.getSaldo();
				datos[i][4] = e.getLimite();
				datos[i][5] = e.getIdUsuario();
			}
		}
		
		return datos;
	}

	
	
}
