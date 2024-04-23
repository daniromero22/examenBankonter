package principal.controllers;

import java.util.List;

import principal.entities.Estudiante;

public class DatosDeTabla {

	private static Object[][] datos = null;
 	
	
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "Nombre", "Apellido 1", "Apellido 2", "DNI", "Direccion", "Email", "Telefono", "Sexo", "Imagen", "ColorFavorito"};
	}
	
	
	public static Object[][] getDatosDeTabla() {
		if (datos == null) {
			List<Estudiante> estudiantes = (List<Estudiante>) ControladorEstudiantes.getInstance().findAll();
			datos = new Object[estudiantes.size()][11];
			for (int i = 0; i < estudiantes.size(); i++) {
				Estudiante e = estudiantes.get(i);
				datos[i][0] = e.getId();
				datos[i][1] = e.getNombre();
				datos[i][2] = e.getApellido_1();
				datos[i][3] = e.getApellido_2();
				datos[i][4] = e.getDni();
				datos[i][5] = e.getDireccion();
				datos[i][6] = e.getMail();
				datos[i][7] = e.getTelefono();
				datos[i][8] = e.getIdSexo();
				datos[i][9] = e.getImagen();
				datos[i][10] = e.getColorFavorito();
			}
		}
		
		return datos;
	}

	
	
}
