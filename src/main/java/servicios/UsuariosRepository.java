package servicios;
import org.springframework.data.jpa.repository.JpaRepository;

import dtos.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	
	
} 