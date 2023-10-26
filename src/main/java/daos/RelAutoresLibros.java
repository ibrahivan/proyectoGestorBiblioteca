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
@Table(name="RelAutoresLibros", schema="gbp_operacional")
public class RelAutoresLibros {
    @Id
    @Column(name = "id_rel_autores_libros")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rel_autores_libros;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    Autores autor; // Relación con la entidad Autor

    @ManyToOne
    @JoinColumn(name = "id_libro")
    Libros libro; // Relación con la entidad Libro

    public RelAutoresLibros() {
    	
    }

	public RelAutoresLibros(Autores autor, Libros libro) {
		super();
		this.autor = autor;
		this.libro = libro;
	}
    
    
    
}





