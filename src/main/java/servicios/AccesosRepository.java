package servicios;
import org.springframework.data.jpa.repository.JpaRepository;

import dtos.Accesos;
public interface AccesosRepository extends JpaRepository<Accesos, Long> {
	
} 


