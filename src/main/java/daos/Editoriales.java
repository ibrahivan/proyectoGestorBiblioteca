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
@Table(name="Editoriales", schema="gbp_operacional")
public class Editoriales {
    @Id
    @Column(name = "id_editorial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_editorial;

    @Column(name = "nombre_editorial")
    private String nombre_editorial;
    
    @OneToMany(mappedBy="editorial") // Mapea la relación uno a muchos con la propiedad "editorial" en la clase Libros
	List<Libros> librosEditoriales;

    //Constructores
    public Editoriales() {
    	
    }

	public Editoriales(String nombre_editorial) {
		super();
		this.nombre_editorial = nombre_editorial;
	}
    
    
}