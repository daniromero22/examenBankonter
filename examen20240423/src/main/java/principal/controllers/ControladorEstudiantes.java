package principal.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import principal.entities.Estudiante;




public class ControladorEstudiantes extends SuperControlador {
	private static ControladorEstudiantes instance = null;
	
	public ControladorEstudiantes() {
		super("estudiante", Estudiante.class);
		// TODO Auto-generated constructor stub
	}
	
	public static ControladorEstudiantes getInstance() {
		if (instance == null) {
			instance = new ControladorEstudiantes();
		}
		return instance;
	}
	
	public Estudiante obtenerEstudiantePorId(int idEstudiante) {
		return  (Estudiante) getEntityManager().createNativeQuery("SELECT * FROM estudiante where id = " + idEstudiante, Estudiante.class).getSingleResult();

	}
	
	
	
	public void mostrarEstudiante(Estudiante e) {
		
		
		
	}
	

	
	
	
	
	
	
	
	
}
