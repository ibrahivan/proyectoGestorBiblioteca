package daos;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    
    @OneToOne
    @JoinColumn(name = "id_libro")
    Libro libro;

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


    
    //Constructores
    public Prestamo() {
		super();
	}



	public Prestamo(Usuario usuario, Libro libro, Calendar fch_inicio_prestamo, Calendar fch_fin_prestamo,
			Calendar fch_entrega_prestamo, EstadoPrestamo estadoPrestamo) {
		super();
		this.usuario = usuario;
		this.libro = libro;
		this.fch_inicio_prestamo = fch_inicio_prestamo;
		this.fch_fin_prestamo = fch_fin_prestamo;
		this.fch_entrega_prestamo = fch_entrega_prestamo;
		this.estadoPrestamo = estadoPrestamo;
	}



	
    
    
    
}
