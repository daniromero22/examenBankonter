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

import principal.entities.Contrato;




public class ControladorContrato extends SuperControlador {
	private static ControladorContrato instance = null;
	
	public ControladorContrato() {
		super("contrato", Contrato.class);
		// TODO Auto-generated constructor stub
	}
	
private static EntityManager em =  Persistence.createEntityManagerFactory("Bankonter").createEntityManager();
	
	private static String nombreTabla = "contrato";
	
	public static ControladorContrato getInstance() {
		if (instance == null) {
			instance = new ControladorContrato();
		}
		return instance;
	}
	
	public Contrato obtenerEstudiantePorId(int idEstudiante) {
		return  (Contrato) getEntityManager().createNativeQuery("SELECT * FROM estudiante where id = " + idEstudiante, Contrato.class).getSingleResult();

	}
	
	
	
	public void mostrarEstudiante(Contrato e) {
		
		
		
	}
	

	public static Contrato getPrimero() {
		Query q  = em.createNativeQuery("Select min(id) from "  + nombreTabla);
		int primerId = (int) q.getSingleResult();
		Contrato c = em.find(Contrato.class, primerId);
		return c;
	}
	
	
	
	
	
	
	
	
}
