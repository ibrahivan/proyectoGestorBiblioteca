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
@Table(name="Colecciones", schema="gbp_operacional")
public class Colecciones {
    @Id
    @Column(name = "id_coleccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_coleccion;

    @Column(name = "nombre_coleccion")
    private String nombre_coleccion;

    @OneToMany(mappedBy="coleccion") // Mapea la relación uno a muchos con la propiedad "coleccion" en la clase Libros
	List<Libros> librosColeccion;
    
  //Constructores
    public Colecciones() {
    }

	public Colecciones(String nombre_coleccion) {
		super();
		this.nombre_coleccion = nombre_coleccion;
	}
    
    
}