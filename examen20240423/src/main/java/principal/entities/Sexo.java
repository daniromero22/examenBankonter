package principal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "sexo")
public class Sexo extends Entidad {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int id;
	String descripcion;
	
	
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


	public Sexo() {
		super();
	}


	@Override
	public String toString() {
		return  descripcion;
	}



	
	
	
	
	
}
