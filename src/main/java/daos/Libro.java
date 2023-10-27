package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy="libro") // Mapea la relación uno a muchos con la propiedad "usuario" en la clase Prestamos
    private List<Prestamo> librosPrestamos;
    
    @ManyToMany(mappedBy="listaLibros")
    private List<Autor>listaAutores;
    
  //Constructores
    public Libro() {
    }

public Libro(String isbn_libro, String titulo_libro, String edicion_libro, int cantidad_libro, Editorial editorial,
		Genero genero, Coleccion coleccion) {
	super();
	this.isbn_libro = isbn_libro;
	this.titulo_libro = titulo_libro;
	this.edicion_libro = edicion_libro;
	this.cantidad_libro = cantidad_libro;
	this.editorial = editorial;
	this.genero = genero;
	this.coleccion = coleccion;

}

public Libro(String isbn_libro, String titulo_libro, String edicion_libro, int cantidad_libro, Editorial editorial,
		Genero genero, Coleccion coleccion, List<Prestamo> librosPrestamos) {
	super();
	this.isbn_libro = isbn_libro;
	this.titulo_libro = titulo_libro;
	this.edicion_libro = edicion_libro;
	this.cantidad_libro = cantidad_libro;
	this.editorial = editorial;
	this.genero = genero;
	this.coleccion = coleccion;
	this.librosPrestamos = librosPrestamos;
}



	
    
    
}







