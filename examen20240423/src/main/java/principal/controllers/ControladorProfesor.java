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

import principal.entities.Profesor;




public class ControladorProfesor extends SuperControlador{
	private static ControladorProfesor instance = null;

	public ControladorProfesor() {
		super("profesor", Profesor.class);
	}

	public static ControladorProfesor getInstance() {
		if (instance == null) {
			instance = new ControladorProfesor();
		}
		return instance;
	}
	
	
	
	
	
}
