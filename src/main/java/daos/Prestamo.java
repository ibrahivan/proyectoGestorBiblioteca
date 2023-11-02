package daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Prestamos", schema="gbp_operacional")
public class Prestamo {
    @Id
    @Column(name = "id_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_prestamo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;
    
    @ManyToMany(mappedBy = "prestamoConLibro")
	List<Libro> libroConPrestamo;

    @Column(name = "fch_inicio_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_inicio_prestamo;

    @Column(name = "fch_fin_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_fin_prestamo;

    @Column(name = "fch_entrega_prestamo")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fch_entrega_prestamo;

    @ManyToOne
    @JoinColumn(name = "id_estado_prestamo")
    private EstadoPrestamo estadoPrestamo;


    
    public int getId_prestamo() {
		return id_prestamo;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public List<Libro> getLibroConPrestamo() {
		return libroConPrestamo;
	}



	public Calendar getFch_inicio_prestamo() {
		return fch_inicio_prestamo;
	}



	public Calendar getFch_fin_prestamo() {
		return fch_fin_prestamo;
	}



	public Calendar getFch_entrega_prestamo() {
		return fch_entrega_prestamo;
	}



	public EstadoPrestamo getEstadoPrestamo() {
		return estadoPrestamo;
	}



	//Constructores
    public Prestamo() {
		super();
	}



	public Prestamo(Usuario usuario, List<Libro> libroConPrestamo, Calendar fch_inicio_prestamo,
			Calendar fch_fin_prestamo, Calendar fch_entrega_prestamo, EstadoPrestamo estadoPrestamo) {
		super();
		this.usuario = usuario;
		this.libroConPrestamo = libroConPrestamo;
		this.fch_inicio_prestamo = fch_inicio_prestamo;
		this.fch_fin_prestamo = fch_fin_prestamo;
		this.fch_entrega_prestamo = fch_entrega_prestamo;
		this.estadoPrestamo = estadoPrestamo;
	}



	



	
    
    
    
}
