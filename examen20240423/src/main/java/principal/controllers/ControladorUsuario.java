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

import principal.entities.Usuario;

public class ControladorUsuario {
private static EntityManager em =  Persistence.createEntityManagerFactory("Bankonter").createEntityManager();
	
	private static String nombreTabla = "usuario";
	
	public static Usuario findArtById(int id) {
		try {
			Usuario entidad = (Usuario) em.find(Usuario.class, id);
			return entidad;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	
	
	public static List<Usuario> findAll() {
		return (List<Usuario>) em.createNativeQuery("SELECT * FROM " + nombreTabla, Usuario.class)
				.getResultList();
		
		

	}
	
	
	public static void update(Usuario e) {
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}

}

