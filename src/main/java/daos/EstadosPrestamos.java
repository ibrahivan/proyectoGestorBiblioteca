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
public class EstadosPrestamos {
    @Id
    @Column(name = "id_estado_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estado_prestamo;

    @Column(name = "codigo_estado_prestamo")
    private String codigo_estado_prestamo;

    @Column(name = "descripcion_estado_prestamo")
    private String descripcion_estado_prestamo;

	@OneToMany(mappedBy="estadoPrestamo")
	List<Prestamos>prestamosEstado;
    
    //Constructores
    
    public EstadosPrestamos() {
		super();
	}

	public EstadosPrestamos(String codigo_estado_prestamo, String descripcion_estado_prestamo) {
		super();
		this.codigo_estado_prestamo = codigo_estado_prestamo;
		this.descripcion_estado_prestamo = descripcion_estado_prestamo;
	}
    
    
}
