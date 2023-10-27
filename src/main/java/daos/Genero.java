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
@Table(name="Generos", schema="gbp_operacional")
public class Genero {
    @Id
    @Column(name = "id_genero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_genero;

    @Column(name = "nombre_genero")
    private String nombre_genero;

    @Column(name = "descripcion_genero")
    private String descripcion_genero;

    @OneToMany(mappedBy="genero") // Mapea la relación uno a muchos con la propiedad "genero" en la clase Libros
    private List<Libro> librosGeneros;
    
    //Constructores
    public Genero() {
    }

	public Genero(String nombre_genero, String descripcion_genero) {
		super();
		this.nombre_genero = nombre_genero;
		this.descripcion_genero = descripcion_genero;
	}
    
    
}