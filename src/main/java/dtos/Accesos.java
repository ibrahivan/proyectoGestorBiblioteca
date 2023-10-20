package dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Accesos {
	@Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_acceso;
    @Column
    private String codigo_acceso;
    @Column
    private String descripcion_acceso;
    
    @ManyToOne // Mapea la relación muchos a uno con la clase Usuario
    @JoinColumn(name = "id_acceso") // Nombre de la columna FK en la tabla Acceso
    private Usuarios usuarios;

    
    //getters/setters
	public Long getId_acceso() {
		return id_acceso;
	}
	public void setId_acceso(Long id_acceso) {
		this.id_acceso = id_acceso;
	}
	public String getCodigo_acceso() {
		return codigo_acceso;
	}
	public void setCodigo_acceso(String codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}
	public String getDescripcion_acceso() {
		return descripcion_acceso;
	}
	public void setDescripcion_acceso(String descripcion_acceso) {
		this.descripcion_acceso = descripcion_acceso;
	}
	
	 
    //Constructor
	
	public Accesos(String codigo_acceso, String descripcion_acceso) {
		super();
		this.codigo_acceso = codigo_acceso;
		this.descripcion_acceso = descripcion_acceso;
	}
   
	
}