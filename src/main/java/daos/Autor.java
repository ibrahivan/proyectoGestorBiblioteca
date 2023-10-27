package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Autores", schema="gbp_operacional")
public class Autor {
    @Id
    @Column(name = "id_autor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_autor;

    @Column(name = "nombre_autor")
    private String nombre_autor;

    @Column(name = "apellidos_autor")
    private String apellidos_autor;

    @ManyToMany
    private List<Libro>listaLibros;
    
    
    public Autor() {
    	
    }


	public Autor(String nombre_autor, String apellidos_autor) {
		super();
		this.nombre_autor = nombre_autor;
		this.apellidos_autor = apellidos_autor;
	}
    
    
}