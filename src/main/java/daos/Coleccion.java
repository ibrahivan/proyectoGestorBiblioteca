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
public class Coleccion {
    @Id
    @Column(name = "id_coleccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_coleccion;

    @Column(name = "nombre_coleccion")
    private String nombre_coleccion;

    @OneToMany(mappedBy="coleccion") // Mapea la relación uno a muchos con la propiedad "coleccion" en la clase Libros
    private List<Libro> librosColeccion;
    
    
    
    
  public int getId_coleccion() {
		return id_coleccion;
	}

public String getNombre_coleccion() {
		return nombre_coleccion;
	}

	public List<Libro> getLibrosColeccion() {
		return librosColeccion;
	}

	//Constructores
    public Coleccion() {
    }

	public Coleccion(String nombre_coleccion) {
		super();
		this.nombre_coleccion = nombre_coleccion;
		this.librosColeccion = librosColeccion;
	}

	
    
    
}