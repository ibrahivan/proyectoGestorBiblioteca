package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Libros", schema="gbp_operacional")
public class Libro {
    @Id
    @Column(name = "id_libro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_libro;

    @Column(name = "isbn_libro")
    private String isbn_libro;

    @Column(name = "titulo_libro")
    private String titulo_libro;

    @Column(name = "edicion_libro")
    private String edicion_libro;

    @Column(name = "cantidad_libro")
    private int cantidad_libro;
    
    @ManyToOne
    @JoinColumn(name = "id_editorial")
    private Editorial editorial;

 
    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_coleccion")
    private Coleccion coleccion;

    @ManyToMany
	@JoinTable(
	        name = "rel_prestamos_libros",
	        schema = "gbp_operacional",
	        joinColumns = @JoinColumn(name = "id_libro_FK"),
	        inverseJoinColumns = @JoinColumn( name = "id_prestamo_FK"))
	List<Prestamo> prestamoConLibro;
    
    @ManyToMany
	@JoinTable(
	        name = "rel_autores_libros",
	        schema = "gbp_operacional",
	        
	        joinColumns = @JoinColumn( name = "id_libro_FK"),
	        inverseJoinColumns = @JoinColumn( name = "id_autor_FK"))
	List<Autor> autorConLibro;
    
  public int getId_libro() {
		return id_libro;
	}

	public String getIsbn_libro() {
		return isbn_libro;
	}

	public String getTitulo_libro() {
		return titulo_libro;
	}

	public String getEdicion_libro() {
		return edicion_libro;
	}

	public int getCantidad_libro() {
		return cantidad_libro;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public Genero getGenero() {
		return genero;
	}

	public Coleccion getColeccion() {
		return coleccion;
	}

	public List<Prestamo> getPrestamoConLibro() {
		return prestamoConLibro;
	}

	public List<Autor> getAutorConLibro() {
		return autorConLibro;
	}

	//Constructores
    public Libro() {
    }

public Libro(String isbn_libro, String titulo_libro, String edicion_libro, int cantidad_libro, Editorial editorial,
		Genero genero, Coleccion coleccion, List<Autor> autorConLibro) {
	super();
	this.isbn_libro = isbn_libro;
	this.titulo_libro = titulo_libro;
	this.edicion_libro = edicion_libro;
	this.cantidad_libro = cantidad_libro;
	this.editorial = editorial;
	this.genero = genero;
	this.coleccion = coleccion;
	this.prestamoConLibro = prestamoConLibro;
	this.autorConLibro = autorConLibro;
}






	
    
    
}







