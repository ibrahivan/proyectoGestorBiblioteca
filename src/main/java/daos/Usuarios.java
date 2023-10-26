package daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name="Usuarios", schema="gbp_operacional")
public class Usuarios {
	@Column(name="id_usuario", nullable=false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
	
	@Column(name="dni_usuario", nullable=false)
    private String dni_usuario;
	
	@Column(name="nombre_usuario")
    private String nombre_usuario;
	
	@Column(name="apellidos_usuario")
    private String apellidos_usuario;
	
	@Column(name="tlf_usuario")
    private String tlf_usuario;
	
	
	@Column(name="email_usuario")
    private String email_usuario;
	
	@Column(name="clave_usuario")
    private String clave_usuario;
	
	@Column(name="estaBloqueado_usuario")
    private Boolean estaBloqueado_usuario;
	
	@Column(name="fch_fin_bloqueo_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_fin_bloqueo_usuario;
	
	@Column(name="fch_alta__usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_alta__usuario;
	
	@Column(name="fch_baja_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_baja_usuario;
	
	/*@Column(name="id_acceso")
	private Long id_acceso; */
	
	 
	    
	@ManyToOne  							// Mapea la relación muchos a uno con la clase Accesos
	@JoinColumn(name="id_acceso")			// Nombre de la columna FK en la tabla Usuarios
	Accesos acceso;

    @OneToMany(mappedBy="usuario") // Mapea la relación uno a muchos con la propiedad "usuario" en la clase Prestamos
	List<Prestamos> usuariosConPrestamos;
	
	
	//Constructores
	
	public Usuarios() {
		super();
	}
	
	public Usuarios(String dni_usuario, String nombre_usuario, String apellidos_usuario,
			String tlf_usuario, String email_usuario, String clave_usuario, Boolean estaBloqueado_usuario,
			Calendar fch_fin_bloqueo_usuario, Calendar fch_alta__usuario, Accesos acceso) {
		super();
		
		this.dni_usuario = dni_usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellidos_usuario = apellidos_usuario;
		this.tlf_usuario = tlf_usuario;
		this.email_usuario = email_usuario;
		this.clave_usuario = clave_usuario;
		this.estaBloqueado_usuario = estaBloqueado_usuario;
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
		this.fch_alta__usuario = fch_alta__usuario;
		
		this.acceso = acceso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
