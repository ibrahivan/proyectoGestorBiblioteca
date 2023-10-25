package daos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Accesos", schema="gbp_operacional")
public class Accesos {
	@Column(name="id_acceso", nullable=false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_acceso;
	
	@Column(name="codigo_acceso")
    private String codigo_acceso;
	
	@Column(name="descripcion_acceso")
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
	
	public Accesos() {
		super();
	}
	
	public Accesos(Long id_acceso, String codigo_acceso, String descripcion_acceso, Usuarios usuarios) {
		super();
		this.id_acceso = id_acceso;
		this.codigo_acceso = codigo_acceso;
		this.descripcion_acceso = descripcion_acceso;
		this.usuarios = usuarios;
	}
	public Accesos(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}