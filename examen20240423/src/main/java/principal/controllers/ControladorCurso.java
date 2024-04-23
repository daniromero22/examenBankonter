package principal.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import principal.entities.Curso;


public class ControladorCurso extends SuperControlador {
	
	public ControladorCurso(String nombreTabla, Class tipoEntidad) {
		super(nombreTabla, tipoEntidad);
		// TODO Auto-generated constructor stub
	}


	private static EntityManager em =  Persistence.createEntityManagerFactory("CentroEducativo").createEntityManager();
	
	private static String nombreTabla = "curso";

	
	
	public Curso getPrimero() {
		Query q  = em.createNativeQuery("Select min(id) from "  + nombreTabla);
		int primerId = (int) q.getSingleResult();
		Curso c = em.find(Curso.class, primerId);
		return c;
	}

	public Curso getUltimo() {
		Query q  = em.createNativeQuery("Select max(id) from "  + nombreTabla);
		int primerId = (int) q.getSingleResult();
		Curso c = em.find(Curso.class, primerId);
		return c;
	}

	
	public Curso getFabricanteSiguienteAnterior(int id) {
		return null;


	}
	
	
	

	public Curso getEntidad(Connection conn, String sql) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		Curso o = null;

		if (rs.next()) {
			o = new Curso();
			o.setId(rs.getInt("id"));
			o.setDescripcion(rs.getString("descripcion"));

		}
		return o;
	}
	
	
	public List<Curso> getTodos(){
		List<Curso> l = new ArrayList<Curso>();
		

		
		return l;
	}

	
	
	
	
	
	
	
	
	
	
	

}
