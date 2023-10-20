package dtos;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuarios {
	@Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
	@Column
    private String dni_usuario;
	@Column
    private String nombre_usuario;
	@Column
    private String apellidos_usuario;
	@Column
    private String tlf_usuario;
	@Column
    private String email_usuario;
	@Column
    private String clave_usuario;
	@Column
    private Boolean estaBloqueado_usuario;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_fin_bloqueo_usuario;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_alta__usuario;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_baja_usuario;
	@Column
	private Long id_acceso; 
	
	 @OneToMany(mappedBy = "id_acceso") // Mapea la relación uno a muchos con la propiedad "usuario" en la clase Acceso
	    private List<Accesos> accesos;
	
    //getters/setters
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getDni_usuario() {
		return dni_usuario;
	}
	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellidos_usuario() {
		return apellidos_usuario;
	}
	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}
	public String getTlf_usuario() {
		return tlf_usuario;
	}
	public void setTlf_usuario(String tlf_usuario) {
		this.tlf_usuario = tlf_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getClave_usuario() {
		return clave_usuario;
	}
	public void setClave_usuario(String clave_usuario) {
		this.clave_usuario = clave_usuario;
	}
	public Boolean getEstaBloqueado_usuario() {
		return estaBloqueado_usuario;
	}
	public void setEstaBloqueado_usuario(Boolean estaBloqueado_usuario) {
		this.estaBloqueado_usuario = estaBloqueado_usuario;
	}
	public Calendar getFch_fin_bloqueo_usuario() {
		return fch_fin_bloqueo_usuario;
	}
	public void setFch_fin_bloqueo_usuario(Calendar fch_fin_bloqueo_usuario) {
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
	}
	public Calendar getFch_alta__usuario() {
		return fch_alta__usuario;
	}
	public void setFch_alta__usuario(Calendar fch_alta__usuario) {
		this.fch_alta__usuario = fch_alta__usuario;
	}
	public Calendar getFch_baja_usuario() {
		return fch_baja_usuario;
	}
	public void setFch_baja_usuario(Calendar fch_baja_usuario) {
		this.fch_baja_usuario = fch_baja_usuario;
	}
	public Long getId_acceso() {
		return id_acceso;
	}
	public void setId_acceso(Long id_acceso) {
		this.id_acceso = id_acceso;
	}
	public Usuarios(String dni_usuario, String nombre_usuario, String apellidos_usuario, String tlf_usuario,
			String email_usuario, String clave_usuario, Boolean estaBloqueado_usuario, Calendar fch_alta__usuario
			) {
		super();
		this.dni_usuario = dni_usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellidos_usuario = apellidos_usuario;
		this.tlf_usuario = tlf_usuario;
		this.email_usuario = email_usuario;
		this.clave_usuario = clave_usuario;
		this.estaBloqueado_usuario = estaBloqueado_usuario;
		this.fch_alta__usuario = fch_alta__usuario;
		
	}
	
	
	//Constructor
	
	
	
	
	
}
