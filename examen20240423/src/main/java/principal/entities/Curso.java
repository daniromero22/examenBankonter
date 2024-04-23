package principal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso extends Entidad{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String descripcion;
	
	
	
	
	
	
	@Override
	public String toString() {
		return descripcion;
	}

	public Curso() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
