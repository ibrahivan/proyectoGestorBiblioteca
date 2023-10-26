package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    
	@OneToMany(mappedBy="acceso") // Mapea la relación uno a muchos con la propiedad "acceso" en la clase Ususarios
	List<Usuarios> usuariosConAcceso;

	
	 
    //Constructor
	
	public Accesos() {
		super();
	}
	
	
	
	public Accesos(String codigo_acceso, String descripcion_acceso) {
		super();
		this.codigo_acceso = codigo_acceso;
		this.descripcion_acceso = descripcion_acceso;
	}
	
	public Accesos(Long id_acceso, String codigo_acceso, String descripcion_acceso, List<Usuarios> usuariosConAcceso) {
		super();
		this.id_acceso = id_acceso;
		this.codigo_acceso = codigo_acceso;
		this.descripcion_acceso = descripcion_acceso;
		this.usuariosConAcceso = usuariosConAcceso;
	}
	
	
	
	
	
	
}