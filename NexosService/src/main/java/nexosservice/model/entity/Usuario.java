package nexosservice.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCRMENTABLE
	private Long id;
	
	private String nombre;
	
	private int edad;
	
	private String cargo;
	
	@Column(name = "fch_ingreso_compania")
    @PersistenceContext(name = "fch_ingreso_compania")	
	private String fchIgresocompania;
	

	public Usuario(Long id, String nombre, int edad, String cargo, String fchIgresocompania) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.cargo = cargo;
		this.fchIgresocompania = fchIgresocompania;
	}

	public Usuario() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFchIgresocompania() {
		return fchIgresocompania;
	}

	public void setFchIgresocompania(String fchIgresocompania) {
		this.fchIgresocompania = fchIgresocompania;
	}

	
	

}
