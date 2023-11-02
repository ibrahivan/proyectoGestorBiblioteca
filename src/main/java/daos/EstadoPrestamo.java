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
@Table(name="EstadosPrestamos", schema="gbp_operacional")
public class EstadoPrestamo {
    @Id
    @Column(name = "id_estado_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estado_prestamo;

    @Column(name = "codigo_estado_prestamo")
    private String codigo_estado_prestamo;

    @Column(name = "descripcion_estado_prestamo")
    private String descripcion_estado_prestamo;

	@OneToMany(mappedBy="estadoPrestamo")
	private List<Prestamo> listaprestamosEstado;

  
    public int getId_estado_prestamo() {
		return id_estado_prestamo;
	}

	public String getCodigo_estado_prestamo() {
		return codigo_estado_prestamo;
	}

	public String getDescripcion_estado_prestamo() {
		return descripcion_estado_prestamo;
	}

	public List<Prestamo> getListaprestamosEstado() {
		return listaprestamosEstado;
	}

	  //Constructores
    
	public EstadoPrestamo() {
		super();
	}

	public EstadoPrestamo(String codigo_estado_prestamo, String descripcion_estado_prestamo) {
		super();
		this.codigo_estado_prestamo = codigo_estado_prestamo;
		this.descripcion_estado_prestamo = descripcion_estado_prestamo;
	}
    
    
}
